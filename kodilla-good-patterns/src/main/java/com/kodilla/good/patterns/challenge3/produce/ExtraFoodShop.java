package com.kodilla.good.patterns.challenge3.produce;

import com.kodilla.good.patterns.challenge3.model.Product;
import com.kodilla.good.patterns.challenge3.model.Quantity;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ExtraFoodShop implements Food2Door {

    private static Map<Product, Quantity> products;
    private boolean ordered;

    public ExtraFoodShop() {
        this.products = new LinkedHashMap<>();
    }

    @Override
    public Map<Product, Quantity> getProducts() {
        return products;
    }

    @Override
    public boolean getOrdered() {
        return ordered;
    }

    @Override
    public String producerInfo() {
        return "ExtraFoodShop";
    }

    @Override
    public void addProduct(Product product, Quantity quantity) {
        products.put(product, quantity);
    }

    @Override
    public void process(Product productOrder, Quantity quantityOrder) {
        if (quantityOrder.getQuantity() > products.get(productOrder).getQuantity()) {
            ordered = false;
        } else {
            products.put(productOrder, new Quantity(products.get(productOrder).getQuantity() - quantityOrder.getQuantity(), quantityOrder.getUnit()));
            ordered = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtraFoodShop that = (ExtraFoodShop) o;
        return ordered == that.ordered && Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, ordered);
    }
}

