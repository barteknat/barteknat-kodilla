package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Test for adding figures")
    class TestAddFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(new Circle(5));
            shapeCollector.addFigure(new Square(10));
            shapeCollector.addFigure(new Triangle(7, 5));

            //Then
            Assertions.assertEquals(3, shapeCollector.shapesSize());
        }
    }

    @Nested
    @DisplayName("Tests for removing figures")
    class TestRemoveFigures {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Triangle(3, 4));

            //When
            boolean result = shapeCollector.removeFigure(new Circle(2));

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(1, shapeCollector.shapesSize());
        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(new Circle(1));

            //Then
            Assertions.assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Tests for getting figures")
    class TestGetFigures {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(5));
            shapeCollector.addFigure(new Square(10));
            shapeCollector.addFigure(new Triangle(7, 5));

            //When
            Shape retrievedShape = shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(new Triangle(7, 5), retrievedShape);
        }

        @Test
        void testGetFigureNotExisting() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(5));
            shapeCollector.addFigure(new Square(10));
            shapeCollector.addFigure(new Triangle(7, 5));

            //When
            Shape retrievedShape = shapeCollector.getFigure(5);

            //Then
            Assertions.assertEquals(null, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Tests for show figures")
    class TestShowFigures {
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            String expectedFigures = new Circle(5) + ", " + new Square(10) + ", " + new Triangle(7, 5);
            shapeCollector.addFigure(new Circle(5));
            shapeCollector.addFigure(new Square(10));
            shapeCollector.addFigure(new Triangle(7, 5));

            //Then
            Assertions.assertEquals(expectedFigures, shapeCollector.showFigures());
        }
    }
}
