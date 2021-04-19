package com.kodilla.good.patterns.challenge4.database;

import com.kodilla.good.patterns.challenge4.model.Arrival;
import com.kodilla.good.patterns.challenge4.model.Departure;
import com.kodilla.good.patterns.challenge4.model.Flight;
import com.kodilla.good.patterns.challenge4.model.Flights;

import java.util.*;

public class FlightDatabase {

    private final Set<Flights> flights = new LinkedHashSet<>();

    public FlightDatabase() {
    }

    public Set<Flights> getFlights() {
        flights.add(new Flights(
                new Flight(new Departure("Warsaw"), new Arrival("Amsterdam")),
                new Flight(new Departure("Amsterdam"), new Arrival("Sydney"))));
        flights.add(new Flights(
                new Flight(new Departure("Warsaw"), new Arrival("Paris")),
                new Flight(new Departure("Paris"), new Arrival("Rome"))));
        flights.add(new Flights(
                new Flight(new Departure("Warsaw"), new Arrival("Berlin")),
                new Flight(new Departure("Berlin"), new Arrival("Rome"))));
        flights.add(new Flights(
                new Flight(new Departure("Warsaw"), new Arrival("Berlin")),
                new Flight(new Departure("Berlin"), new Arrival("Sydney"))));
        flights.add(new Flights(
                new Flight(new Departure("Warsaw"), new Arrival("Paris")),
                new Flight(new Departure("Paris"), new Arrival("Sydney"))));
        return flights;
    }
}

