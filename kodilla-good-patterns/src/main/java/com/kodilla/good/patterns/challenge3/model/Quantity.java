package com.kodilla.good.patterns.challenge3.model;

import java.util.Objects;

public class Quantity {

    private final int quantity;
    private final String unit;

    public Quantity(int quantity, String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity that = (Quantity) o;
        return quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                '}';
    }
}

