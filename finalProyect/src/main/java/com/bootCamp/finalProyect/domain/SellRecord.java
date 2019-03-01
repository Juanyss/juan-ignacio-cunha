package com.bootCamp.finalProyect.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "SellRecord")
public class SellRecord implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long productId;
    private String productName;
    private Integer quantity;
    @Digits(integer=8, fraction=2)
    private Double amount;
    private LocalDateTime dateSell;

    public SellRecord() {
        this.dateSell = LocalDateTime.now();
    }

    public SellRecord(Long userId, Long productId, String productName, Integer quantity, Double amount) {
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.amount = amount;
        this.dateSell = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateSell() {
        return dateSell;
    }

    public void setDateSell(LocalDateTime dateSell) {
        this.dateSell = dateSell;
    }
}
