package com.kodilla.testing.shape;

public class Circle implements Shape{

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public String getShapeName() {
        return "circle";
    }

    public double getField() {
        return 3.14 * r * r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return (int)r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", s=" + getField() +
                "u2}";
    }
}
