package com.kodilla.good.patterns.challenge4.model;

import java.util.Objects;

public class Arrival {

    private final String arrivalAirport;

    public Arrival(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arrival arrival = (Arrival) o;
        return Objects.equals(arrivalAirport, arrival.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalAirport);
    }

    @Override
    public String toString() {
        return arrivalAirport;
    }
}

