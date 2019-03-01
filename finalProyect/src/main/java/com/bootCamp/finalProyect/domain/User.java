package com.bootCamp.finalProyect.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "User")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mail;
    private String password;
    private String name;
    private String lastName;

    private Long shoppingCart;



    public User() {
    }

    public User(String mail, String password, String name, String lastName) {
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }

    public User(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Long shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
