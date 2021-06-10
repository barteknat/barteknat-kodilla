package com.kodilla.good.patterns.challenge4.model;

import java.util.Objects;

public class Flights {

    private final Flight flight1;
    private final Flight flight2;

    public Flights(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    public Flight getFlight1() {
        return flight1;
    }

    public Flight getFlight2() {
        return flight2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(flight1, flights.flight1) && Objects.equals(flight2, flights.flight2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flight1, flight2);
    }

    @Override
    public String toString() {
        return flight1 + ", " + flight2;
    }
}

