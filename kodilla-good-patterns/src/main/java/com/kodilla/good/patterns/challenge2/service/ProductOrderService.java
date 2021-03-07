package com.kodilla.good.patterns.challenge2.service;

import com.kodilla.good.patterns.challenge2.model.Cart;
import com.kodilla.good.patterns.challenge2.model.Product;
import com.kodilla.good.patterns.challenge2.model.User;

public class ProductOrderService implements OrderService {

    @Override
    public boolean orderProduct(User user, Product product, Cart cart) {
        return cart.getAddToCart();
    }
}

