package com.kodilla.good.patterns.challenge4.database;

import com.kodilla.good.patterns.challenge4.model.Arrival;
import com.kodilla.good.patterns.challenge4.model.Departure;
import com.kodilla.good.patterns.challenge4.model.Flight;

import java.util.LinkedHashMap;
import java.util.Map;

public class FlightDatabase {

    Map<Flight, Flight> flightDatabase = new LinkedHashMap<>();

    public Map<Flight, Flight> initFlights() {
        flightDatabase.put(
                new Flight(new Departure("Warsaw"), new Arrival("Torino")),
                new Flight(new Departure("Torino"), new Arrival("Rome")));
        flightDatabase.put(
                new Flight(new Departure("Warsaw"), new Arrival("Cracow")),
                new Flight(new Departure("Cracow"), new Arrival("Rome")));
        flightDatabase.put(
                new Flight(new Departure("Warsaw"), new Arrival("Berlin")),
                new Flight(new Departure("Berlin"), new Arrival("Madrid")));
        flightDatabase.put(
                new Flight(new Departure("Prague"), new Arrival("Berlin")),
                new Flight(new Departure("Berlin"), new Arrival("Rome")));
        flightDatabase.put(
                new Flight(new Departure("Warsaw"), new Arrival("Oslo")),
                new Flight(new Departure("Oslo"), new Arrival("Madrid")));
        return flightDatabase;
    }
}

