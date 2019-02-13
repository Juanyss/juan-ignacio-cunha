package com.bootCamp.topic6.repositories;

import com.bootCamp.topic6.domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
    List<ShoppingCart> findAll();
    ShoppingCart save(ShoppingCart shoppingCart);
    void deleteById(Long id);
}

