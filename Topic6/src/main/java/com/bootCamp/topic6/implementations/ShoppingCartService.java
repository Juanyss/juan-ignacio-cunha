package com.bootCamp.topic6.implementations;

import com.bootCamp.topic6.domain.ShoppingCart;
import com.bootCamp.topic6.interfaces.ShoppingCartImp;
import com.bootCamp.topic6.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShoppingCartService implements ShoppingCartImp {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    public List<ShoppingCart> findAll(){
        return (List<ShoppingCart>) this.shoppingCartRepository.findAll();
    }

    @Autowired
    public boolean save(ShoppingCart shoppingCart){
        ShoppingCart sc = new ShoppingCart();

        sc.setName(shoppingCart.getName());
        sc.setPrice(shoppingCart.getPrice());
        this.shoppingCartRepository.save(sc);
        return true;
    }

    @Autowired
    public void deleteById(Long id){
        this.shoppingCartRepository.deleteById(id);
    }


}
