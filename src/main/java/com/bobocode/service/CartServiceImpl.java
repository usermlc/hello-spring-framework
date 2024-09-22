package com.bobocode.service;

import com.bobocode.dao.ProductRepository;
import com.bobocode.exception.ProductNotFoundException;
import com.bobocode.model.Cart;
import com.bobocode.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Cart getNewCart() {
        return new Cart();
    }

    @Override
    public void addProduct(Cart cart, Product product, Integer quantity) {
        // Get product from repository
        Product repoProduct = productRepository.findById(product.getId());
        if (repoProduct != null) {
            cart.addProduct(repoProduct, quantity);
        } else {
            throw new ProductNotFoundException("Product not found in repository");
        }
    }

    @Override
    public void delProduct(Cart cart, Product product) {
        cart.delProduct(product);
    }
}
