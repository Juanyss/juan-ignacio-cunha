package com.bootCamp.finalProyect.implementations;

import com.bootCamp.finalProyect.domain.Item;
import com.bootCamp.finalProyect.domain.Product;
import com.bootCamp.finalProyect.domain.ShoppingCart;
import com.bootCamp.finalProyect.domain.User;
import com.bootCamp.finalProyect.interfaces.ShoppingCartImp;
import com.bootCamp.finalProyect.repositories.ItemRepository;
import com.bootCamp.finalProyect.repositories.ProductRepository;
import com.bootCamp.finalProyect.repositories.ShoppingCartRepository;
import com.bootCamp.finalProyect.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingCartService implements ShoppingCartImp {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private ItemRepository itemRepository;

    public ShoppingCartService() {
    }

    @Override
    public List<Item> findAll(Long userId){
        return this.itemRepository.findAll(this.shoppingCartRepository.getShoppingCartId(userId));
    }


    @Override
    public void addProduct(Long userId, Long productId, Integer quantity){


        if (this.shoppingCartRepository.findOne(userId) == null){
            ShoppingCart shoppingCart = new ShoppingCart(userId,this.userRepository.findOne(userId).getId());
            checkForItem(userId,shoppingCart, productId, quantity);
            this.shoppingCartRepository.save(shoppingCart);
            this.userRepository.referenceShoppingCart(userId,this.shoppingCartRepository.findOne(userId).getIdShoppingCart());

        } else{
            ShoppingCart shoppingCart = this.shoppingCartRepository.findOne(userId);
            checkForItem(userId,shoppingCart, productId, quantity);
            this.shoppingCartRepository.save(shoppingCart);
        }

        try{
            if(this.itemRepository.productQuantity(this.shoppingCartRepository.getShoppingCartId(userId),productId) <= 0){
                this.itemRepository.deleteById(this.shoppingCartRepository.getShoppingCartId(userId),productId);
            }
        }catch (Exception e) {
            // Catch the null exception error
        }


    }

    @Override
    public void deleteById(Long userId,Long productId){
        this.itemRepository.deleteById(this.shoppingCartRepository.getShoppingCartId(userId),productId);
    }

    @Override
    public void clearShoppingCart(Long userId){
        this.itemRepository.deleteAll(this.shoppingCartRepository.getShoppingCartId(userId));
    }

    @Override
    public Double totalAmount(Long userId){
        return this.itemRepository.totalAmount(this.shoppingCartRepository.getShoppingCartId(userId));
    }




    private void checkForItem(Long userId,ShoppingCart shoppingCart, Long productId, Integer quantity){
        if(shoppingCart.existsProduct(productId)){
            if(quantity < 0){
                shoppingCart.getItem(productId).downQuantity(quantity);
            }else{
                shoppingCart.getItem(productId).updateQuantity(quantity);
            }
        }else{
            if(quantity > 0) {
                Product product = this.productRepository.findOne(productId);
                Item i = new Item(product.getId(), quantity);
                this.itemRepository.save(i);
                shoppingCart.getItemList().add(i);
                shoppingCart.getItemList().get(shoppingCart.getItemList().size() - 1).setShoppingCart(shoppingCart);
            }

        }
    }



}
