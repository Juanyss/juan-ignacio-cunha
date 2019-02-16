package com.bootCamp.topic6.repositories;

import com.bootCamp.topic6.domain.ShoppingCart;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
    List<ShoppingCart> findAll();

    @Query("select sc from ShoppingCart sc where sc.id = :id")
    ShoppingCart findOne(@Param("id") Long id);

    ShoppingCart save(ShoppingCart shoppingCart);

    void deleteById(Long id);

    @Transactional
    @Modifying
    @Query("update ShoppingCart sc set sc.quantity = :quantity where sc.id = :id")
    void updateQuantity(@Param("id") Long id, @Param("quantity") Integer quantity);

    @Query("select (sum(price*quantity)) from ShoppingCart")
    double totalAmount();


}

