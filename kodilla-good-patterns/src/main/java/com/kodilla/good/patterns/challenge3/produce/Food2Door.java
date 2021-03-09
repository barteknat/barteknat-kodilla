package com.kodilla.good.patterns.challenge3.produce;

import com.kodilla.good.patterns.challenge3.model.Product;
import com.kodilla.good.patterns.challenge3.model.Quantity;

import java.util.Map;

public interface Food2Door {

    Map<Product, Quantity> getProducts();

    default void printProducts(Map<Product, Quantity> products) {
        System.out.println(products);
    }

    boolean getOrdered();

    String producerInfo();

    default void printProducerInfo(String producerInfo) {
        System.out.println(producerInfo);
    }

    default void printOrderProduct(Product product, Quantity quantity) {
        System.out.println("The order is: " + product + " " + quantity);
    }

    void addProduct(Product product, Quantity quantity);

    void process(Product productOrder, Quantity quantityOrder);

    default void printOrderConfirmed() {
        System.out.println("The order has been confirmed.");
    }
    default void printOrderRejected() {
        System.out.println("The order has been rejected.");
    }
}

