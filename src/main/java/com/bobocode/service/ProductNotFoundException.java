package com.bobocode.service; // Переконайся, що пакет відповідає твоїй структурі

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
