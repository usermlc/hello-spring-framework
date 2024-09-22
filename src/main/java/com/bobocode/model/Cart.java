package com.bobocode.model;

import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
public class Cart {
    private Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    public void delProduct(Product product) {
        products.remove(product);
    }

}
