package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawerTestSuite {

    @Test
    void testDoDrawingCircle() {
        //Given
        Shape shape = new Circle();
        Drawer drawer = new Drawer(shape);

        //When
        String result = drawer.doDrawing();

        //Then
        Assertions.assertEquals("this is a circle", result);

    }

    @Test
    void testDoDrawingTriangle() {
        //Given
        Shape shape = new Triangle();
        Drawer drawer = new Drawer(shape);

        //When
        String result = drawer.doDrawing();

        //Then
        Assertions.assertEquals("this is a triangle", result);

    }
}
