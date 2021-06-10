package com.kodilla.good.patterns.challenge3.model;

import com.kodilla.good.patterns.challenge3.repository.Adder;

public class OrderRetriever {

    private final Adder adder;

    public OrderRetriever() {
        adder = new Adder();
    }

    public Order retrieve() {
        adder.addProductsToShops();
        adder.addProducersToRepository();
        Product product = new Product("product3");
        Quantity quantity = new Quantity(1000, "kg");
        return new Order(1, product, quantity);
    }
}

