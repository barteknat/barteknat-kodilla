package com.kodilla.good.patterns.challenge2.model;

import java.util.Objects;

public class OrderNumber {

    private final int number;

    public OrderNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "{" +
                "OrderNumber=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderNumber that = (OrderNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

