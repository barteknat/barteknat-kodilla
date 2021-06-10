package com.kodilla.testing.shape;

public class Square implements Shape{

    private final double a;

    public Square(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "square";
    }

    public double getField() {
        return a * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return (int)a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", s=" + getField() +
                "u2}";
    }
}
