package com.kodilla.good.patterns.challenge3.repository;

import com.kodilla.good.patterns.challenge3.produce.ExtraFoodShopFood2Door;
import com.kodilla.good.patterns.challenge3.produce.Food2Door;
import com.kodilla.good.patterns.challenge3.produce.GlutenFreeShopFood2Door;
import com.kodilla.good.patterns.challenge3.produce.HealthyShopFood2Door;

import java.util.Objects;

public class Adder {

    private final Repository producerRepository;
    private final Food2Door extraFoodShop;
    private final Food2Door glutenFreeShop;
    private final Food2Door healthyShop;

    public Adder() {
        producerRepository = new ProducerRepository();
        extraFoodShop = new ExtraFoodShopFood2Door("Extra Food Shop");
        glutenFreeShop = new GlutenFreeShopFood2Door("Gluten Free Shop");
        healthyShop = new HealthyShopFood2Door("Healthy Shop");
    }

    public void addProductsToShops() {
        extraFoodShop.setProducts();
        glutenFreeShop.setProducts();
        healthyShop.setProducts();
    }

    public void addProducersToRepository() {
        producerRepository.add(extraFoodShop);
        producerRepository.add(glutenFreeShop);
        producerRepository.add(healthyShop);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adder that = (Adder) o;
        return Objects.equals(producerRepository, that.producerRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producerRepository);
    }
}

