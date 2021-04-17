package com.kodilla.good.patterns.challenge3.model;

import java.util.Objects;

public class Product {

    private final String productKind;

    public Product(String productKind) {
        this.productKind = productKind;
    }

    public String getProductKind() {
        return productKind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return Objects.equals(productKind, that.productKind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productKind);
    }

    @Override
    public String toString() {
        return productKind;
    }
}

