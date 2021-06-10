package com.kodilla.good.patterns.challenge4.model;

import java.util.Objects;

public class Departure {

    private final String airport;

    public Departure(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departure departure = (Departure) o;
        return Objects.equals(airport, departure.airport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airport);
    }

    @Override
    public String toString() {
        return airport;
    }
}

