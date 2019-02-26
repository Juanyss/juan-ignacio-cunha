package com.bootCamp.finalProyect.implementations;

import com.bootCamp.finalProyect.domain.ShoppingCart;
import com.bootCamp.finalProyect.interfaces.ShoppingCartImp;
import com.bootCamp.finalProyect.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingCartService implements ShoppingCartImp {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService() {
    }

    @Override
    public List<ShoppingCart> findAll(){
        return this.shoppingCartRepository.findAll();
    }

    @Override
    public ShoppingCart findOne(Long id){
        return this.shoppingCartRepository.findOne(id);
    }

    @Override
    public boolean save(ShoppingCart shoppingCart){
        ShoppingCart sc = new ShoppingCart();
        sc.setProduct(shoppingCart.getProduct());
        sc.setQuantity(shoppingCart.getQuantity());
        this.shoppingCartRepository.save(sc);
        return true;
    }

    @Override
    public void deleteById(Long id){
        this.shoppingCartRepository.deleteById(id);
    }

    @Override
    public void updateShoppingCart(Long id,Integer quantity){
        this.shoppingCartRepository.updateShoppingCart(id,quantity);
    }
}
