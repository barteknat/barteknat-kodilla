package com.kodilla.good.patterns.challenge3.repository;

import com.kodilla.good.patterns.challenge3.produce.ExtraFoodShop;
import com.kodilla.good.patterns.challenge3.produce.GlutenFreeShop;
import com.kodilla.good.patterns.challenge3.produce.HealthyShop;

public class ProducerAdder {

    private final Repository producerRepository;

    public ProducerAdder() {
        producerRepository = new ProducerRepository();
    }

    public void addToRepository() {
        producerRepository.add(new ExtraFoodShop());
        producerRepository.add(new HealthyShop());
        producerRepository.add(new GlutenFreeShop());
    }
}

