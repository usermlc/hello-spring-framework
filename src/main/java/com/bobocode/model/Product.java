package com.bobocode.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
}
