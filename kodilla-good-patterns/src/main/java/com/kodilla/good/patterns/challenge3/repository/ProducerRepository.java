package com.kodilla.good.patterns.challenge3.repository;

import com.kodilla.good.patterns.challenge3.produce.Food2Door;

import java.util.HashSet;
import java.util.Set;

public class ProducerRepository implements Repository {

    private static Set<Food2Door> producers = new HashSet<>();

    public void add(Food2Door producer) {
        producers.add(producer);
    }

    public Set<Food2Door> getProducers() {
        return producers;
    }
}

