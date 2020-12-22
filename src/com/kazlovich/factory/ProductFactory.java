package com.kazlovich.factory;

import com.kazlovich.entity.*;
import com.kazlovich.pool.Pool;

public class ProductFactory {
    public static Product createProduct(UserRequest req){
        Product product = null;

        switch (req.getType()){
            case Food : product = new FoodProduct(req.getName(), req.getPrice(), req.getCalories());
                                    Pool.getPool().put(req.getName(), product);
                                    break;
            case NonFood: product = new NonFoodProduct(req.getName(), req.getPrice());
                                    Pool.getPool().put(req.getName(), product);
                                    break;
            default: throw new IllegalArgumentException("Illegal food type");
        }
        return product;
    }
}
