package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    public List<Shape> addFigure(Shape shape) {
        if (shape != null) shapes.add(shape);
        return shapes;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public int shapesSize() {
        return shapes.size();
    }

    public Shape getFigure(int n) {
        return (n < 0 || n > shapes.size()) ? null : shapes.get(n);
    }

    public String showFigures() {
        if (shapes.isEmpty()) return null;
        String figure = shapes.get(0).toString();
        for (int i = 1; i < shapes.size(); i++) {
            figure += ", " + shapes.get(i);
        }
        return figure;
    }
}
