package com.bootCamp.topic6.interfaces;

import com.bootCamp.topic6.domain.ShoppingCart;
import com.sun.xml.internal.bind.v2.model.core.ID;


import java.util.List;

public interface ShoppingCartImp {
    public List<ShoppingCart> findAll();
    public ShoppingCart findOne(Long id);
    public boolean save(ShoppingCart shoppingCart);
    public void deleteById(Long id);
    public void updateQuantity(Long id,Integer quantity);
    public Double totalAmount();


}

