package com.kodilla.good.patterns.challenge3.model;

import java.util.Objects;

public class Order {

    private final int number;
    private final Product product;
    private final Quantity quantity;

    public Order(int number, Product product, Quantity quantity) {
        this.number = number;
        this.product = product;
        this.quantity = quantity;
    }

    public int getNumber() {
        return number;
    }

    public Product getProduct() {
        return product;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return number == order.number && Objects.equals(product, order.product) && Objects.equals(quantity, order.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, product, quantity);
    }

    @Override
    public String toString() {
        return "Order number #" + number + ": [" + product + ", quantity: " + quantity + "]";
    }
}

