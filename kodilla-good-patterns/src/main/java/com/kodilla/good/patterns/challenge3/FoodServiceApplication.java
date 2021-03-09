package com.kodilla.good.patterns.challenge3;

import com.kodilla.good.patterns.challenge3.engine.OrderProcessor;
import com.kodilla.good.patterns.challenge3.model.Order;
import com.kodilla.good.patterns.challenge3.model.OrderRetriever;
import com.kodilla.good.patterns.challenge3.produce.*;

public class FoodServiceApplication {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new HealthyShop(), new HealthyShopOffer(new HealthyShop()));
        orderProcessor.processor(order);
    }
}

