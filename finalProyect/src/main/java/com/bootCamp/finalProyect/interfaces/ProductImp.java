package com.bootCamp.finalProyect.interfaces;

import com.bootCamp.finalProyect.domain.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductImp {
    /**
    / Product CRUD
    */
    List<Product> findAll();
    Product findOne(Long id);
    boolean save(Product product);
    void deleteById(Long id);
    void updateProduct(Long id,String name, String category, Double price);

    /**
    / Product special requirements
    */
    List<Product> findAllByName(String name);
    List<Product> findAllByCategory(String category);


}
