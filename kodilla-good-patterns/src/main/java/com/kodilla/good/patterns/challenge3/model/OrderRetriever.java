package com.kodilla.good.patterns.challenge3.model;

public class OrderRetriever {

    public Order retrieve() {
        Product product = new Product("product2");
        Quantity quantity = new Quantity(100, "kg");
        return new Order(product, quantity);
    }
}

