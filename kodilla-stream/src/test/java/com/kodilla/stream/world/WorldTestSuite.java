package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        //When
        world.addContinents();
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("3140000000");

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
