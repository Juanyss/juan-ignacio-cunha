package com.bootCamp.finalProyect.interfaces;

import com.bootCamp.finalProyect.domain.ShoppingCart;

import java.util.List;

public interface ShoppingCartImp {
    List<ShoppingCart> findAll();
    ShoppingCart findOne(Long id);
    boolean save(ShoppingCart shoppingCart);
    void deleteById(Long id);
    void updateShoppingCart(Long id,Integer quantity);
}
