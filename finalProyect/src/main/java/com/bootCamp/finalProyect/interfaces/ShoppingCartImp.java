package com.bootCamp.finalProyect.interfaces;

import com.bootCamp.finalProyect.domain.Item;
import com.bootCamp.finalProyect.domain.Product;
import com.bootCamp.finalProyect.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShoppingCartImp{

    List<Item> findAll(Long userId);
    void addProduct(Long shoppingCartId, Long productId, Integer quantity);

    void deleteById(Long userId, Long productId);
    void clearShoppingCart(Long userId);

    Double totalAmount(Long userId);


}
