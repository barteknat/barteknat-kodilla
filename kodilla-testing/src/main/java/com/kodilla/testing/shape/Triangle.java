package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private final double a;
    private final double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return 0.5 * a * h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 && Double.compare(triangle.h, h) == 0;
    }

    @Override
    public int hashCode() {
        return (int)a + (int)h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                ", s=" + getField() +
                "u2}";
    }
}
