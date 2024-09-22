package com.bobocode;

import com.bobocode.dao.ProductRepository;
import com.bobocode.model.Cart;
import com.bobocode.model.Product;
import com.bobocode.service.CartService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CartServiceTest {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductRepository productRepository;

    @Test
    void testAddProductToCart() {
        Cart cart = cartService.getNewCart();
        Product product = productRepository.findById(1L);

        cartService.addProduct(cart, product, 2);
        assertEquals(2, cartService.getProductQuantity(cart, product));
    }

    @Test
    void testGetCartSum() {
        com.bobocode.model.Cart cart = cartService.getNewCart();
        Product product1 = productRepository.findById(1L);
        Product product2 = productRepository.findById(2L);

        cartService.addProduct(cart, product1, 2);
        cartService.addProduct(cart, product2, 1);

        BigDecimal expectedSum = product1.getPrice().multiply(BigDecimal.valueOf(2))
            .add(product2.getPrice());
        assertEquals(expectedSum, cartService.getSum(cart));
    }
}
