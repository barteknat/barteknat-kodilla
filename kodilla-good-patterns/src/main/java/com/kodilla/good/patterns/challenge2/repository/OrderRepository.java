package com.kodilla.good.patterns.challenge2.repository;

import com.kodilla.good.patterns.challenge2.model.*;

public interface OrderRepository {

    void createOrder(int orderNumber, Order order);
}

