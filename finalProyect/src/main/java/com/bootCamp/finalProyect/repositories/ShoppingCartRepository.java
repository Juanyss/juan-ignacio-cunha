package com.bootCamp.finalProyect.repositories;

import com.bootCamp.finalProyect.domain.ShoppingCart;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

    @Query("select sc from ShoppingCart sc where sc.idShoppingCart = :id")
    ShoppingCart findOne(@Param("id") Long id);

    ShoppingCart save(ShoppingCart shoppingCart);

    @Query("SELECT sc from ShoppingCart sc where sc.user = :idUser")
    ShoppingCart getShoppingCartId(@Param("idUser") Long idUser);

}
