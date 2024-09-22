package com.bobocode.service;

import com.bobocode.model.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
@Scope("prototype")
public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public Map<Product, Integer> getCartMap() {
        return cartMap;
    }

    public void addProduct(Product product, Integer quantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
    }

    public void delProduct(Product product, Integer quantity) {
        if (cartMap.containsKey(product)) {
            int currentQuantity = cartMap.get(product);
            if (currentQuantity <= quantity) {
                cartMap.remove(product);
            } else {
                cartMap.put(product, currentQuantity - quantity);
            }
        }
    }

    public BigDecimal getSum() {
        return cartMap.entrySet().stream()
            .map(entry -> entry.getKey().getPrice().multiply(BigDecimal.valueOf(entry.getValue())))
            .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
