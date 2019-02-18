package com.bootCamp.topic6.restController;

import com.bootCamp.topic6.domain.ShoppingCart;
import com.bootCamp.topic6.implementations.ShoppingCartService;
import com.bootCamp.topic6.repositories.ShoppingCartRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/shoppingCart")
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    //Roots
    @ApiOperation("Return 1 Product from Shopping Cart")
    @GetMapping("/{id}")
    ShoppingCart shoppingCartById(@PathVariable("id") Long id){
        return shoppingCartService.findOne(id);
    }

    @ApiOperation("Return all Products from Shopping Cart")
    @GetMapping("")
    List<ShoppingCart> shoppingCart(){
        return shoppingCartService.findAll();
    }

    @ApiOperation("Add new product to Shopping Cart")
    @PostMapping("/insertProduct")
    void insertProduct(@RequestBody ShoppingCart shoppingCart){
        this.shoppingCartService.save(shoppingCart);
    }

    @ApiOperation("Delete 1 Product from Shopping Cart")
    @DeleteMapping("/deleteById/{id}")
    void deleteById(@PathVariable("id")Long id){
        this.shoppingCartService.deleteById(id);
    }

    @ApiOperation("Update quantity of items from 1 product in Shopping Cart")
    @PostMapping("/updateQuantity/{id}")
    void updateQuantity(@PathVariable("id")Long id,@RequestBody Integer quantity){
        ShoppingCart updateSC = this.shoppingCartService.findOne(id);

        this.shoppingCartService.updateQuantity(updateSC.getId(),quantity);
    }

    @ApiOperation("Calculate the total amount of all items from Shopping Cart")
    @GetMapping("/total")
    Double totalAmount(){
        return this.shoppingCartService.totalAmount();

    }

}
