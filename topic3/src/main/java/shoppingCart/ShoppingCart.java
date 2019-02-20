package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingCart;
    private boolean checkedOut;


    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
        this.checkedOut = false;
    }

    public ShoppingCart(List<Item> shoppingCart) {
        this.shoppingCart = shoppingCart;
        this.checkedOut = false;
    }


    public List<Item> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Item> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public boolean isCheckOut() {
        return checkedOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkedOut = checkOut;
    }


    /**
     * Check if the product exist in the shopping cart
     * @param product
     * @return a item from the shopping cart
     */
    public boolean containsProduct(Product product){
        Item item = getItemById(product.getId());
        return (item != null);
    }


    //Add Product service
    /**
     * Add a product to Shopping cart.
     * @param product
     * @return a new item in the shopping cart
     */
    public void addToShoppingCart(Product product){
        if(containsProduct(product)){
           getItemById(product.getId()).updateQuantity();
        }else {
            shoppingCart.add(new Item(product));
        }
    }


    //Delete product service
    /**
     * Delete a product from Shopping cart.
     * @param id
     */
    public void deleteProduct(Integer id){
        shoppingCart.removeIf(item -> (item.getProduct().getId() == id));
    }

    //Find item service
    /**
     * Go through Shopping cart checking if id exist.
     * @param id
     * @return a item from the shopping cart or null
     */
    public Item getItemById(Integer id){
        for(Item item : shoppingCart){
            if(item.getProduct().getId() == id){
                return item;
            }
        }
        return null;
    }

    //Clear shopping cart service
    /**
     * Clear all products from Shopping cart.
     */
    public void clearShoppingCart(){
        shoppingCart.clear();
    }


    //Total amount of items service
    /**
     * Calculate the total amount from Shopping cart & change the state of the shopping cart
     * @return the total amount.
     */
    public double totalAmount(){
        double total = 0.0;
        for(Integer i=0; i<shoppingCart.size();i++){
            total += (shoppingCart.get(i).getProduct().getPrice() * shoppingCart.get(i).getQuantity());
        }

        checkedOut = true;
        return total;


    }

}
