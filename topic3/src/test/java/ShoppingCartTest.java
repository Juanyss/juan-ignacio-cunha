import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shoppingCart.Product;
import shoppingCart.ShoppingCart;



public class ShoppingCartTest {
    private Product product1,product2,product3,product4,product5;
    private ShoppingCart shoppingCart;

    @Before
    public void StartUp(){

        product1 = new Product(1,"Samsumg J7",100.00);
        product2 = new Product(2,"Samsumg J7 Pro", 150.00);
        product3 = new Product(3,"Samsumg Galaxy", 80.00);
        product4 = new Product(4,"Samsumg J5", 75.00);
        product5 = new Product(5,"Hauwei P55", 150.00);

        shoppingCart = new ShoppingCart();
        shoppingCart.addToShoppingCart(product1);

    }

    @Test
    public void addProductToShoppingCart(){
        shoppingCart.addToShoppingCart(product2);
        shoppingCart.addToShoppingCart(product3);
        shoppingCart.addToShoppingCart(product4);
        shoppingCart.addToShoppingCart(product5);

        Assert.assertTrue(shoppingCart.containsProduct(product2));
        Assert.assertTrue(shoppingCart.containsProduct(product3));
        Assert.assertTrue(shoppingCart.containsProduct(product4));
        Assert.assertTrue(shoppingCart.containsProduct(product5));
    }

    @Test
    public void addProductThatAlreadyExistInShoppingCart(){
        shoppingCart.addToShoppingCart(product1);
        Assert.assertEquals(2,shoppingCart.getItemById(1).getQuantity().intValue());
    }

    @Test
    public void foundItemById(){
        Assert.assertEquals(product1,shoppingCart.getItemById(1).getProduct());
    }

    @Test
    public void notFoundItemById(){
        Assert.assertNotEquals(product2,shoppingCart.getItemById(1).getProduct());
    }

    @Test
    public void deleteProductFromShoppingCart(){
        shoppingCart.deleteProduct(1);
        Assert.assertFalse(shoppingCart.containsProduct(product1));
    }


    @Test
    public void totalAmountService(){
        shoppingCart.addToShoppingCart(product1);
        shoppingCart.addToShoppingCart(product5);

        //Product 1 = 100 x 2
        //Product 5 = 150 x 1

        Assert.assertEquals(350,shoppingCart.totalAmount(),0.00);
        Assert.assertTrue(shoppingCart.isCheckOut());
    }
}
