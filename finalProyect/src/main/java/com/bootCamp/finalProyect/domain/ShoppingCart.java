package com.bootCamp.finalProyect.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idShoppingCart;
    private Long user;

    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL)
    private List<Item> itemList;

    public ShoppingCart() {
    }

    public ShoppingCart(Long idShoppingCart,Long user) {
        this.idShoppingCart = idShoppingCart;
        this.itemList = new ArrayList<>();
        this.user = user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdShoppingCart() {
        return idShoppingCart;
    }

    public void setIdShoppingCart(Long idShoppingCart) {
        this.idShoppingCart = idShoppingCart;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> shoppingCart) {
        this.itemList = shoppingCart;
    }


    public boolean existsProduct(Long idProduct) {
        return itemList.stream()
                .anyMatch(Item -> Item.getProduct().equals(idProduct));
    }

    public Item getItem(Long idProduct){
        return itemList.stream().filter(Item -> Item.getProduct().equals(idProduct)).findAny().get();
    }



}
