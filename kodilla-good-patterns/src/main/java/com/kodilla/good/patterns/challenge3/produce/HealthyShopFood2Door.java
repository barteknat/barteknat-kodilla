package com.kodilla.good.patterns.challenge3.produce;

import com.kodilla.good.patterns.challenge3.model.Order;
import com.kodilla.good.patterns.challenge3.model.Product;
import com.kodilla.good.patterns.challenge3.model.Quantity;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class HealthyShopFood2Door implements Food2Door {

    private final String name;
    private static Map<Product, Quantity> products;

    public HealthyShopFood2Door(String name) {
        this.name = name;
        this.products = new LinkedHashMap<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Map<Product, Quantity> getProducts() {
        return products;
    }

    @Override
    public void setProducts() {
        products.put(new Product("product5"), new Quantity(200, "kg"));
        products.put(new Product("product3"), new Quantity(230, "kg"));
    }

    @Override
    public boolean process(Order order) {
        if (isNoProduct(order)) {
            Food2Door.printNoProduct(order, getName());
            return false;
        }
        if (isWrongUnit(order)) {
            Food2Door.printWrongUnit();
            return false;
        }
        if (isEnoughQuantity(order)) {
            updateShopQuantity(order);
            Food2Door.printOrderPossible(order, getName());
            return true;
        }
        Food2Door.printOrderDenied(order, getName());
        return false;
    }

    private void updateShopQuantity(Order order) {
        products.put(order.getProduct(), new Quantity(products.get(order.getProduct()).getProductAmount() - order.getQuantity().getProductAmount(), order.getQuantity().getUnit()));
    }

    private boolean isEnoughQuantity(Order order) {
        return order.getQuantity().getProductAmount() <= products.get(order.getProduct()).getProductAmount();
    }

    private boolean isWrongUnit(Order order) {
        return !order.getQuantity().getUnit().equals(products.get(order.getProduct()).getUnit());
    }

    private boolean isNoProduct(Order order) {
        return !products.containsKey(order.getProduct()) || order.getProduct() == null || order.getQuantity() == null;
    }

    @Override
    public String toString() {
        return "\n" + name + ":\n" + getProducts();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthyShopFood2Door that = (HealthyShopFood2Door) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

