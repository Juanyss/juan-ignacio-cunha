package com.bootCamp.topic6.interfaces;

import com.bootCamp.topic6.domain.ShoppingCart;



import java.util.List;

public interface ShoppingCartImp {
    public List<ShoppingCart> findAll();
    public boolean save(ShoppingCart shoppingCart);
    public void deleteById(Long id);
}

