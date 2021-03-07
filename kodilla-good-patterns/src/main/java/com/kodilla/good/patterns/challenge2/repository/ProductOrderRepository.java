package com.kodilla.good.patterns.challenge2.repository;

import com.kodilla.good.patterns.challenge2.model.Order;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderRepository implements OrderRepository {

    private final static Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void createOrder(int orderNumber, Order order) {
        orders.put(orderNumber, order);
    }
}

