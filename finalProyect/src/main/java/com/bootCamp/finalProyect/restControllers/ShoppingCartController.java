package com.bootCamp.finalProyect.restControllers;

import com.bootCamp.finalProyect.domain.Item;
import com.bootCamp.finalProyect.domain.Product;
import com.bootCamp.finalProyect.domain.ShoppingCart;
import com.bootCamp.finalProyect.domain.User;
import com.bootCamp.finalProyect.implementations.ShoppingCartService;
import com.bootCamp.finalProyect.implementations.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/api/shoppingcart"})
public class ShoppingCartController {
    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @ApiOperation("Show all shopping cart products from a user ")
    @GetMapping("/{userId}")
    public List<Item> showAllProducts(@PathVariable("userId") Long userId) {
        return this.shoppingCartService.findAll(userId);
    }

    @ApiOperation("Add a new product to the Shopping cart")
    @PostMapping("{userId}/addproduct/{productId}")
    public void addProduct(@PathVariable("userId") Long userId,
                           @PathVariable("productId") Long productId,
                           @RequestBody Integer quantity) {
        this.shoppingCartService.addProduct(userId,productId,quantity);
    }

    @ApiOperation("Delete one product from shopping cart By id from a user")
    @DeleteMapping("/{userId}/deleteproduct/{productId}")
    public void deleteProduct(@PathVariable("userId") Long userId, @PathVariable("productId") Long productId) {
        this.shoppingCartService.deleteById(userId,productId);
    }

    @ApiOperation("Delete all product from shopping cart By id from a user")
    @DeleteMapping("/{userId}/deleteallproducts")
    public void clearAllProducts(@PathVariable("userId") Long userId) {
        this.shoppingCartService.clearShoppingCart(userId);
    }

    @ApiOperation("Show price total amount of shopping cart products from a user ")
    @GetMapping("/{userId}/totalamount")
    public Double totalAmount(@PathVariable("userId") Long userId) {
        return this.shoppingCartService.totalAmount(userId);
    }
}
