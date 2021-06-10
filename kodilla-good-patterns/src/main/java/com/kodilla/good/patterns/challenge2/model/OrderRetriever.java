package com.kodilla.good.patterns.challenge2.model;

import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve() {
        User user = new User("Adam", "Smith", "address1 NY");
        OrderNumber orderNumber = new OrderNumber(1);
        Product product = new Product("product", 1000, 1);
        Cart addToCart = new Cart(true);
        Payment payment = new Payment(true);
        LocalDateTime orderDate = LocalDateTime.of(2021, 1, 11, 10, 30);
        return new Order(user, orderNumber, product, addToCart, payment, orderDate);
    }
}

