package com.kazlovich.entity;

public class UserRequest {
    private ProductType type;
    private String name;
    private int price;
    private int calories;

    private UserRequest(ProductType type, String name, int price, int calories) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder{
        private ProductType type;
        private String name;
        private int price;
        private int calories;

        public Builder setType(ProductType type) {
            this.type = type;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }
        public UserRequest complete(){
            return new UserRequest(type, name, price, calories);
        }
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }
}
