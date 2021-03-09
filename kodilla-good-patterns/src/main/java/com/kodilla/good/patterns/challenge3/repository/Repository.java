package com.kodilla.good.patterns.challenge3.repository;

import com.kodilla.good.patterns.challenge3.produce.Food2Door;

import java.util.Set;

public interface Repository {

    void add(Food2Door producer);

    Set<Food2Door> getProducers();
}

