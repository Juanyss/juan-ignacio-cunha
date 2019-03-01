package com.bootCamp.finalProyect.domain;



import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Item")
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long product;
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idShoppingCart")
    private ShoppingCart shoppingCart;

    public Item() {
    }

    public Item(Long product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Long getProduct() {
        return product;
    }

    public void setProduct(Long product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    /**
     * Add product quantity by 1
     */
    public void updateQuantity(Integer update){
        quantity = quantity + update;
    }

    public void downQuantity(Integer decrease){
        quantity = quantity + decrease;
        if(quantity <= 0){
            quantity = 0;
        }
    }
}
