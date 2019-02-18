package com.bootCamp.finalProyect.restControllers;

import com.bootCamp.finalProyect.domain.Product;
import com.bootCamp.finalProyect.implementations.ProductService;
import com.bootCamp.finalProyect.repositories.ProductRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping({"/API/product"})
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ApiOperation("Show all products")
    @GetMapping("")
    public List<Product> showAllProducts() {
        return this.productService.findAll();
    }

    @ApiOperation("Show 1 product via id")
    @GetMapping("/{id}")
    public Product showOneProduct(@PathVariable("id") Long id) {
        return this.productService.findOne(id);
    }

    @ApiOperation("Create a new product")
    @PostMapping("/newProduct")
    public void NewProduct(@RequestBody Product product) {

        product.setCategory(product.getCategory().toLowerCase());
        this.productService.save(product);
    }

    @ApiOperation("Delete one product By id")
    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        this.productService.deleteById(id);
    }

    @ApiOperation("Update product data")
    @PostMapping("/updateProduct/{id}")
    public void updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        this.productService.updateProduct(id, product.getName(), product.getCategory(), product.getQuantity(),
                product.getPrice());
    }

    @ApiOperation("Show all products via name filter")
    @GetMapping("/name/{name}")
    public List<Product> showProductsViaName(@PathVariable("name") String name) {
        return this.productService.findAllByName(name);
    }

    @ApiOperation("Show all products via category filter")
    @GetMapping("/category/{category}")
    public List<Product> showProductsViaCategory(@PathVariable("category") String category) {
        return this.productService.findAllByCategory(category);
    }
}
