package com.kodilla.good.patterns.challenge3.model;

import java.util.Objects;

public class Quantity {

    private final int productAmount;
    private final String unit;

    public Quantity(int productAmount, String unit) {
        this.productAmount = productAmount;
        this.unit = unit;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity that = (Quantity) o;
        return productAmount == that.productAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productAmount);
    }

    @Override
    public String toString() {
        return productAmount + unit;
    }
}

