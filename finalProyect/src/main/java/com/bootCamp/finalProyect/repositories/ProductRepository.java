package com.bootCamp.finalProyect.repositories;

import com.bootCamp.finalProyect.domain.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    /**
    / Product CRUD Repository
    */

    List<Product> findAll();

    @Query("select p from Product p where p.id = :id")
    Product findOne(@Param("id") Long id);

    Product save(Product product);

    void deleteById(Long id);

    @Transactional
    @Modifying
    @Query("update Product p set p.name = :name, p.category = :category, p.quantity = :quantity," +
            "p.price = :price where p.id = :id")
    void updateProduct(@Param("id") Long id,@Param("name") String name,@Param("category") String category,
                       @Param("quantity") Integer quantity, @Param("price") BigDecimal price);

    /**
    / Product special requirements Repository
    */
    @Query("select p from Product p where p.name like %:name%")
    List<Product> findAllByName(@Param("name") String name);

    @Query("select p from Product p where p.category = :category")
    List<Product> findAllByCategory(@Param("category") String category);
}
