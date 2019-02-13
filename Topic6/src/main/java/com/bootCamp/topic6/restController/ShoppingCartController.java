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
    List<ShoppingCart> all(){
        return shoppingCartRepository.findAll();
    }

    @GetMapping("/insertProduct/{name}/{price}")
    List<ShoppingCart> saveProcuct(ShoppingCart shoppingCart, @PathVariable("name")String name,
                                   @PathVariable("price") Double price){
        shoppingCart.setName(name);
        shoppingCart.setPrice(price);
        this.shoppingCartRepository.save(shoppingCart);
        return shoppingCartRepository.findAll();
    }

    @GetMapping("/deleteById/{id}")
    List<ShoppingCart> deleteById(@PathVariable("id")Long id){
        this.shoppingCartRepository.deleteById(id);
        return shoppingCartRepository.findAll();
    }

}
