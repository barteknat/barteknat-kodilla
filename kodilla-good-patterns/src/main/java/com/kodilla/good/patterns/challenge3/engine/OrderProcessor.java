package com.kodilla.good.patterns.challenge3.engine;

import com.kodilla.good.patterns.challenge3.model.Order;
import com.kodilla.good.patterns.challenge3.model.OrderRetriever;
import com.kodilla.good.patterns.challenge3.produce.Food2Door;
import com.kodilla.good.patterns.challenge3.repository.ProducerRepository;
import com.kodilla.good.patterns.challenge3.repository.Repository;

public class OrderProcessor {

    private final Repository producerRepository;
    private final OrderRetriever orderRetriever;

    public OrderProcessor() {
        producerRepository = new ProducerRepository();
        orderRetriever = new OrderRetriever();
    }

    public Order isOrderPossible(Order order) {
        for (Food2Door shop : producerRepository.getProducers()) {
            shop.process(order);
        }
        return order;
    }
}

