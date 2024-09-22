package com.bobocode.service;

import com.bobocode.model.Cart;
import com.bobocode.model.Product;
import java.math.BigDecimal;

public interface CartService {
    Cart getNewCart();
    void addProduct(Cart cart, Product product, Integer quantity);
    void delProduct(Cart cart, Product product);

    int getProductQuantity(Cart cart, Product product);

    BigDecimal getSum(Cart cart);
}
