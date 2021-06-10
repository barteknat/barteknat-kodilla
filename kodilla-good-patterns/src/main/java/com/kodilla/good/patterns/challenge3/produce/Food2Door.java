package com.kodilla.good.patterns.challenge3.produce;

import com.kodilla.good.patterns.challenge3.model.Order;
import com.kodilla.good.patterns.challenge3.model.Product;
import com.kodilla.good.patterns.challenge3.model.Quantity;

import java.util.Map;

public interface Food2Door {

    String getName();

    Map<Product, Quantity> getProducts();

    void setProducts();

    boolean process(Order order);

    static void printOrderPossible(Order order, String name) {
        System.out.println(order + " is possible in " + name);
    }
    static void printOrderDenied(Order order, String name) {
        System.out.println(order + " is not possible in " + name + " - not enough quantity of order product");
    }
    static void printNoProduct(Order order, String name) {
        System.out.println("Product: " + order.getProduct() + " not found in " + name + " database");
    }
    static void printWrongUnit() {
        System.out.println("Wrong unit");
    }
}

