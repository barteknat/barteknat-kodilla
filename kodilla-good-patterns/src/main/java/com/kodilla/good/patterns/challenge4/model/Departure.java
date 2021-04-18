package com.kodilla.good.patterns.challenge4.model;

import java.util.Objects;

public class Departure {

    private final String departureAirport;

    public Departure(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departure departure = (Departure) o;
        return Objects.equals(departureAirport, departure.departureAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport);
    }

    @Override
    public String toString() {
        return departureAirport;
    }
}

