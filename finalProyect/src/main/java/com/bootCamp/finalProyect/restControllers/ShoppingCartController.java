package com.bootCamp.finalProyect.restControllers;

import com.bootCamp.finalProyect.domain.ShoppingCart;
import com.bootCamp.finalProyect.implementations.ShoppingCartService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/shoppingCart"})
public class ShoppingCartController {
    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @ApiOperation("Show all shopping cart products from a user ")
    @GetMapping("")
    public List<ShoppingCart> showAllProducts() {
        return this.shoppingCartService.findAll();
    }

    @ApiOperation("Show 1 product via id from from the Shopping cart")
    @GetMapping("/{id}")
    public ShoppingCart showOneProduct(@PathVariable("id") Long id) {
        return this.shoppingCartService.findOne(id);
    }

    @ApiOperation("Add a new product to the Shopping cart")
    @PostMapping("/addproduct")
    public void addProduct(@RequestBody ShoppingCart shoppingCart) {
        this.shoppingCartService.save(shoppingCart);
    }

    @ApiOperation("Delete one product from shopping cart By id")
    @DeleteMapping("/deleteproduct/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        this.shoppingCartService.deleteById(id);
    }

    @ApiOperation("Update product data in the shopping cart")
    @PostMapping("/updateproduct/{id}")
    public void updateProduct(@PathVariable("id") Long id, @RequestBody Integer quantity) {
        this.shoppingCartService.updateShoppingCart(id,quantity);
    }
}
