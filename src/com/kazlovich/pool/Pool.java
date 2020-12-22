package com.kazlovich.pool;

import com.kazlovich.entity.Product;

import java.util.HashMap;
import java.util.Map;

public class Pool {
    private static Map<String, Product> pool ;

    public static Map<String, Product> getPool() {
        if (pool == null){
            pool = new HashMap<>();
        }
        return pool;
    }
}
