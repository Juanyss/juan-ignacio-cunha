package com.bootCamp.finalProyect.implementations;

import com.bootCamp.finalProyect.domain.Product;
import com.bootCamp.finalProyect.interfaces.ProductImp;
import com.bootCamp.finalProyect.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService implements ProductImp {

    @Autowired
    private ProductRepository productRepository;

    public ProductService() {
    }

    @Override
    public List<Product> findAll(){
        return this.productRepository.findAll();
    }

    @Override
    public Product findOne(Long id){
        return this.productRepository.findOne(id);
    }

    @Override
    public boolean save(Product product){
        Product p = new Product();
        p.setName(product.getName().toLowerCase());
        p.setCategory(product.getCategory().toLowerCase());
        p.setQuantity(product.getQuantity());
        p.setPrice(product.getPrice());
        this.productRepository.save(p);
        return true;
    }

    @Override
    public void deleteById(Long id){
        this.productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(Long id,String name,String category, Integer quantity, BigDecimal price){
        this.productRepository.updateProduct(id,name.toLowerCase(),category.toLowerCase(),quantity,price);
    }

    @Override
    public List<Product> findAllByName(String name){
        return this.productRepository.findAllByName(name.toLowerCase());
    }

    @Override
    public List<Product> findAllByCategory(String category){
        return this.productRepository.findAllByCategory(category.toLowerCase());
    }
}
