package com.kodilla.good.patterns.challenge4.model;

import java.util.Objects;

public class Flight {

    Departure departure;
    Arrival arrival;

    public Flight(Departure departure, Arrival arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Arrival getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure=" + departure +
                ", arrival=" + arrival +
                '}';
    }
}

