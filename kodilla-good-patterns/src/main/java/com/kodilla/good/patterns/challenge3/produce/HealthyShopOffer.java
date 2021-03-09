package com.kodilla.good.patterns.challenge3.produce;

import com.kodilla.good.patterns.challenge3.model.Product;
import com.kodilla.good.patterns.challenge3.model.Quantity;

import java.util.Objects;

public class HealthyShopOffer implements Offer {

    private final Food2Door food2Door;

    public HealthyShopOffer(Food2Door food2Door) {
        this.food2Door = food2Door;
    }

    @Override
    public void addProduct() {
        food2Door.addProduct(new Product("product1"), new Quantity(200, "kg"));
        food2Door.addProduct(new Product("product2"), new Quantity(230, "pieces"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthyShopOffer that = (HealthyShopOffer) o;
        return Objects.equals(food2Door, that.food2Door);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food2Door);
    }
}

