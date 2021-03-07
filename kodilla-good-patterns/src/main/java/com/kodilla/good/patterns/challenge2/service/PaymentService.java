package com.kodilla.good.patterns.challenge2.service;

import com.kodilla.good.patterns.challenge2.model.*;

public interface PaymentService {

    boolean paid(User user, Product product, Payment payment);

    default void printPaymentConfirmed(OrderNumber orderNumber) {
        System.out.println("Payment for order: " + orderNumber + " confirmed");
    }

    default void printNoPayment(OrderNumber orderNumber) {
        System.out.println("Payment for order " + orderNumber + " has not been received");
    }
}

