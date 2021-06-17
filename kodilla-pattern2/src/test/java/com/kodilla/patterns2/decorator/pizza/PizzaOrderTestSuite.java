package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    public PizzaOrder getOrder() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        return theOrder;
    }

    @Test
    void testBasicPizzaWithAdditivesGetCost() {
        //Given
        BigDecimal calculatedCost = getOrder().getCost();
        //When
        //Then
        assertEquals(new BigDecimal(39), calculatedCost);
    }

    @Test
    void testBasicPizzaWithAdditivesGetDescription() {
        //Given
        String description = getOrder().getDescription();
        //When
        //Then
        assertEquals("Order basic pizza with cheese and tomato sauce + ham + mushrooms + olives + extra cheese", description);
    }
}
