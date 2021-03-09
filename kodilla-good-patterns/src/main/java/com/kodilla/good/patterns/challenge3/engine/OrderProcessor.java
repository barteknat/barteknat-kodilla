package com.kodilla.good.patterns.challenge3.engine;

import com.kodilla.good.patterns.challenge3.model.Order;
import com.kodilla.good.patterns.challenge3.produce.Food2Door;
import com.kodilla.good.patterns.challenge3.produce.Offer;

public class OrderProcessor {

    private final Food2Door food2Door;
    private final Offer offer;

    public OrderProcessor(Food2Door food2Door, Offer offer) {
        this.food2Door = food2Door;
        this.offer = offer;
    }

    public void processor(Order order) {
        if (order == null || order.getProduct() == null || order.getQuantity() == null) return;
        offer.addProduct();
        food2Door.printProducerInfo(food2Door.producerInfo());
        food2Door.printProducts(food2Door.getProducts());
        food2Door.printOrderProduct(order.getProduct(), order.getQuantity());
        food2Door.process(order.getProduct(), order.getQuantity());
        if (food2Door.getOrdered()) {
            food2Door.printOrderConfirmed();
        } else {
            food2Door.printOrderRejected();
        }
    }
}

