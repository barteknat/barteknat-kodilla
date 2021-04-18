package com.kodilla.good.patterns.challenge4.database;

import com.kodilla.good.patterns.challenge4.model.Arrival;
import com.kodilla.good.patterns.challenge4.model.Departure;
import com.kodilla.good.patterns.challenge4.model.Flight;

import java.util.*;

public class FlightDatabase {

    private final Set<Flight> flights = new LinkedHashSet<>();

    public FlightDatabase() {
    }

    public Set<Flight> getFlights() {
        flights.add(new Flight(new Departure("Warsaw"), new Arrival("Amsterdam")));
        flights.add(new Flight(new Departure("Warsaw"), new Arrival("Berlin")));
        flights.add(new Flight(new Departure("Warsaw"), new Arrival("Tokyo")));
        flights.add(new Flight(new Departure("Warsaw"), new Arrival("Beijing")));
        flights.add(new Flight(new Departure("Warsaw"), new Arrival("Paris")));
        flights.add(new Flight(new Departure("Warsaw"), new Arrival("Rome")));
        flights.add(new Flight(new Departure("Paris"), new Arrival("Tokyo")));
        flights.add(new Flight(new Departure("Paris"), new Arrival("London")));
        flights.add(new Flight(new Departure("Berlin"), new Arrival("Torino")));
        flights.add(new Flight(new Departure("Paris"), new Arrival("Rome")));
        flights.add(new Flight(new Departure("Berlin"), new Arrival("Rome")));
        return flights;
    }
}

