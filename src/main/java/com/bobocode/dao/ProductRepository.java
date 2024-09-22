package com.bobocode.dao;

import com.bobocode.model.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private Map<Long, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    @PostConstruct
    public void init() {
        addProduct(new Product(1L, "Product1", new BigDecimal("10.0")));
        addProduct(new Product(2L, "Product2", new BigDecimal("20.0")));
        addProduct(new Product(3L, "Product3", new BigDecimal("30.0")));
        addProduct(new Product(4L, "Product4", new BigDecimal("40.0")));
        addProduct(new Product(5L, "Product5", new BigDecimal("50.0")));
    }

    public Product findById(Long id) {
        return productMap.get(id);
    }
}
