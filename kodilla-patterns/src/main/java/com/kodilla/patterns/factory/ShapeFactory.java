package com.kodilla.patterns.factory;

public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(String shapeClass) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("THE CIRCLE", 4.5);
            case SQUARE:
                return new Square("THE SQUARE", 7);
            case RECTANGLE:
                return new Rectangle("THE RECTANGLE", 15, 2.5);
            default:
                return null;
        }
    }
}
