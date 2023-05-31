package com.example.springboot;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Item {

    private @Id @GeneratedValue Long id;
    private String item;
    private double price;
    private int quantity;
    private boolean status;

    public Item(Long id, String item, double price, int quantity, boolean status) {
        this.id = id;
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }
    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
