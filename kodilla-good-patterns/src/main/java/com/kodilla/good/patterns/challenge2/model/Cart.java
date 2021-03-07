package com.kodilla.good.patterns.challenge2.model;

import java.util.Objects;

public class Cart {

    private final boolean addToCart;

    public Cart(boolean addToCart) {
        this.addToCart = addToCart;
    }

    @Override
    public String
    toString() {
        return "Cart{" +
                "addToCart=" + addToCart +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return addToCart == cart.addToCart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addToCart);
    }

    public boolean getAddToCart() {
        return addToCart;
    }
}
