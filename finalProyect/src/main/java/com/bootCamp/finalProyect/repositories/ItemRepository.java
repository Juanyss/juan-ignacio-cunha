package com.bootCamp.finalProyect.repositories;

import com.bootCamp.finalProyect.domain.Item;
import com.bootCamp.finalProyect.domain.ShoppingCart;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {

    @Query("SELECT p.name, i.quantity FROM Item i JOIN Product p ON i.product = p.id " +
            "where i.shoppingCart = :shoppingCart")
    List<Item> findAll(@Param("shoppingCart") ShoppingCart shoppingCart);

    @Query("SELECT i FROM Item i where i.shoppingCart = :shoppingCart")
    List<Item> findAllItems(@Param("shoppingCart") ShoppingCart shoppingCart);

    @Query("SELECT p.name FROM Item i JOIN Product p ON i.product = p.id " +
            "where i.shoppingCart = :shoppingCart")
    List<String> productNames(@Param("shoppingCart") ShoppingCart shoppingCart);

    @Query("SELECT (p.price * i.quantity) FROM Item i JOIN Product p ON i.product = p.id " +
            "where i.shoppingCart = :shoppingCart")
    List<Double> productPrices(@Param("shoppingCart") ShoppingCart shoppingCart);

    Item save(Item item);

    @Transactional
    @Modifying
    @Query("DELETE FROM Item i WHERE i.shoppingCart = :shoppingCart AND i.product = :productId")
    void deleteById(@Param("shoppingCart") ShoppingCart shoppingCart,@Param("productId") Long productId);

    @Transactional
    @Modifying
    @Query("DELETE FROM Item i WHERE i.shoppingCart = :shoppingCart")
    void deleteAll(@Param("shoppingCart") ShoppingCart shoppingCart);

    @Query("SELECT (SUM(p.price * i.quantity)) FROM Product p JOIN Item i ON i.product = p.id " +
            "WHERE i.shoppingCart = :shoppingCart")
    Double totalAmount(@Param("shoppingCart") ShoppingCart shoppingCart);

    @Query("SELECT i.quantity FROM Item i  JOIN Product p ON i.product = p.id " +
            "WHERE i.shoppingCart = :shoppingCart AND i.product = :productId")
    Integer productQuantity(@Param("shoppingCart") ShoppingCart shoppingCart,@Param("productId") Long productId);
}
