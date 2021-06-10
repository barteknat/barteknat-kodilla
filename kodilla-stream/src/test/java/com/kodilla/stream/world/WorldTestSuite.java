package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = prepareData();

        //When

        //Then
        Assertions.assertEquals(new BigDecimal("3140000000"), world.getPeopleQuantity());
    }

    private World prepareData() {
        return new World(Arrays.asList(
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
                        new Country("Mexico", new BigDecimal("150000000"))))));
    }
}
