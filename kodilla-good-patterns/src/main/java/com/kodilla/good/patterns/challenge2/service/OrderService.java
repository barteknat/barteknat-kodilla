package com.kodilla.good.patterns.challenge2.service;

import com.kodilla.good.patterns.challenge2.model.Cart;
import com.kodilla.good.patterns.challenge2.model.OrderNumber;
import com.kodilla.good.patterns.challenge2.model.Product;
import com.kodilla.good.patterns.challenge2.model.User;

import java.time.LocalDateTime;

public interface OrderService {

    boolean orderProduct(User user, Product product, Cart cart);

    default void printOrderProduct(User user, Product product, LocalDateTime orderDate, OrderNumber orderNumber) {
        System.out.println(user + " has ordered: " + product + " on " + orderDate + " order number: " + orderNumber);
    }

    default void printOrderDisabled(OrderNumber orderNumber) {
        System.out.println("Order: " + orderNumber + " cannot be realized");
    }
}

