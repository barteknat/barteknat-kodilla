package com.kodilla.good.patterns.challenge2.service;

import com.kodilla.good.patterns.challenge2.model.OrderNumber;
import com.kodilla.good.patterns.challenge2.model.Product;
import com.kodilla.good.patterns.challenge2.model.User;

public interface InformationService {

    void inform(OrderNumber orderNumber, Product product, User user);

    static void printInformation(OrderNumber orderNumber, Product product, User user) {
        System.out.println(orderNumber + " " + product + " has been sent to: " + user);
    }
}

