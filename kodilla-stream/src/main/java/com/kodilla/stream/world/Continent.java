package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Continent {

    List<Country> europe = Arrays.asList(
            new Country(new BigDecimal("40000000")),
            new Country(new BigDecimal("80000000")),
            new Country(new BigDecimal("90000000")));
    List<Country> asia = Arrays.asList(
            new Country(new BigDecimal("130000000")),
            new Country(new BigDecimal("1300000000")),
            new Country(new BigDecimal("1000000000")));
    List<Country> northAmerica = Arrays.asList(
            new Country(new BigDecimal("120000000")),
            new Country(new BigDecimal("230000000")),
            new Country(new BigDecimal("150000000")));
}
