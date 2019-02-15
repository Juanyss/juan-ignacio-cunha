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
    @GetMapping("/shoppingCart/{id}")
    ShoppingCart shoppingCartById(@PathVariable("id") Long id){
        return shoppingCartRepository.findOne(id);
    }

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

    @PostMapping("/updateQuantity/{id}")
    void updateQuantity(@PathVariable("id")Long id,@RequestBody ShoppingCart sc){
        ShoppingCart updateSC = this.shoppingCartRepository.findOne(id);

        this.shoppingCartRepository.updateQuantity(updateSC.getId(),sc.getQuantity());
    }

    @GetMapping("/total")
    Double totalAmount(){
        List<ShoppingCart> sc = this.shoppingCartRepository.findAll();
        Double total = 0.0;
        for(Integer i=0;i<sc.size();i++){
            total += sc.get(i).getPrice() * sc.get(i).getQuantity();
        }
        return total;
    }

}
