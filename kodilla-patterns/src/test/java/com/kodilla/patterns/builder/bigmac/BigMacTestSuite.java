package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static com.kodilla.patterns.builder.bigmac.BigMac.BicMacBuilder.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BicMacBuilder()
                .bun(SESAME)
                .burgers(2)
                .sauce(BARBECUE)
                .ingredient(BEACON)
                .ingredient(LETTUCE)
                .ingredient(CHEESE)
                .ingredient(ONION)
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals(4, howManyIngredients);
    }
}

