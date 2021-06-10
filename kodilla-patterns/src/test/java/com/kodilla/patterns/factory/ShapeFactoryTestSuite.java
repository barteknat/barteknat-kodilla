package com.kodilla.patterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeFactoryTestSuite {

    @Test
    void testFactoryCircle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);
        //Then
        assertEquals(Math.PI * Math.pow(4.5, 2), circle.getArea(), 0);
        assertEquals("THE CIRCLE", circle.getName());
    }

    @Test
    void testFactorySquare() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE);
        //Then
        assertEquals(7 * 4, square.getCircumference());
        assertEquals("THE SQUARE", square.getName());
    }

    @Test
    void testFactoryRectangle() {
        //Given
        ShapeFactory factory = new ShapeFactory();
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        assertEquals(15 * 2.5, rectangle.getArea());
        assertEquals("THE RECTANGLE", rectangle.getName());
    }
}

