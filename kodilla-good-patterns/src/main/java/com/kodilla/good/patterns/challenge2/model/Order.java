package com.kodilla.good.patterns.challenge2.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {

    private final User user;
    private final OrderNumber orderNumber;
    private final Product product;
    private final Cart addToCart;
    private final Payment payment;
    private final LocalDateTime orderDate;

    public Order(User user, OrderNumber orderNumber, Product product, Cart addToCart, Payment payment, LocalDateTime orderDate) {
        this.user = user;
        this.orderNumber = orderNumber;
        this.product = product;
        this.addToCart = addToCart;
        this.payment = payment;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public OrderNumber getOrderNumber() {
        return orderNumber;
    }

    public Product getProduct() {
        return product;
    }

    public Cart getAddToCart() {
        return addToCart;
    }

    public Payment getPayment() {
        return payment;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", orderNumber=" + orderNumber +
                ", product=" + product +
                ", addToCart=" + addToCart +
                ", payment=" + payment +
                ", orderDate=" + orderDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(user, order.user) && Objects.equals(orderNumber, order.orderNumber) && Objects.equals(product, order.product) && Objects.equals(payment, order.payment) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, orderNumber, product, payment, orderDate);
    }
}

