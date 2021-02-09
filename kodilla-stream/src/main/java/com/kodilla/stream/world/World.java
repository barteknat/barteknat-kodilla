package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World {

    private List<Continent> continents = new ArrayList<>();

    public void addContinents() {
        continents = Arrays.asList(
                new Continent("Europe", Arrays.asList(
                        new Country("Poland", new BigDecimal("40000000")),
                        new Country("France", new BigDecimal("80000000")),
                        new Country("Germany", new BigDecimal("90000000")))),
                new Continent("Asia", Arrays.asList(
                        new Country("Russia", new BigDecimal("130000000")),
                        new Country("China", new BigDecimal("1300000000")),
                        new Country("India", new BigDecimal("1000000000")))),
                new Continent("North America", Arrays.asList(
                        new Country("Canada", new BigDecimal("120000000")),
                        new Country("United States", new BigDecimal("230000000")),
                        new Country("Mexico", new BigDecimal("150000000")))));
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
