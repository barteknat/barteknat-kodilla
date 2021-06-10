package com.kodilla.good.patterns.challenge4.model;

import java.util.Objects;

public class Arrival {

    private final String airport;

    public Arrival(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arrival arrival = (Arrival) o;
        return Objects.equals(airport, arrival.airport);
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

