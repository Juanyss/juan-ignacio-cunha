package com.bootCamp.topic6.restController;

import com.bootCamp.topic6.domain.ShoppingCart;
import com.bootCamp.topic6.repositories.ShoppingCartRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingCartController {

    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartController(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    //Roots
    @GetMapping("/shoppingCart")
    List<ShoppingCart> shoppingCart(){
        return shoppingCartRepository.findAll();
    }


    @PostMapping("/insertProduct")
    void insertProduct(@RequestBody ShoppingCart shoppingCart){
        this.shoppingCartRepository.save(shoppingCart);
    }


    @DeleteMapping("/deleteById/{id}")
    void deleteById(@PathVariable("id")Long id){
        this.shoppingCartRepository.deleteById(id);
    }



}
