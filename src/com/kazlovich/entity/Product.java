package com.kazlovich.entity;

public abstract class Product {
    private static int idCounter = 0;

    int id;
    String name;
    int price;

    public Product(String name, int price) {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
