package com.kazlovich.entity;

public class FoodProduct extends Product{
    private int calories;

    public FoodProduct(String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "calories=" + calories +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
