package com.kodilla.good.patterns.challenge3;

import com.kodilla.good.patterns.challenge3.engine.OrderProcessor;
import com.kodilla.good.patterns.challenge3.model.OrderRetriever;

public class FoodServiceApplication {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.isOrderPossible(orderRetriever.retrieve());
    }
}

