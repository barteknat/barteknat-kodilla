package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;
import com.kodilla.good.patterns.challenge4.model.Flight;
import com.kodilla.good.patterns.challenge4.model.Flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearch implements Search {

    private final FlightDatabase flightDatabase;

    public FlightSearch(FlightDatabase flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

    public Set<Flight> searchFrom(String fromCity) {
        Set<Flight> flight1 = flightDatabase.getFlights().stream()
                .map(Flights::getFlight1)
                .filter(flights -> flights.getDeparture().getAirport().equals(fromCity))
                .collect(Collectors.toSet());
        Set<Flight> flight2 = flightDatabase.getFlights().stream()
                .map(Flights::getFlight2)
                .filter(flights -> flights.getDeparture().getAirport().equals(fromCity))
                .collect(Collectors.toSet());
        Set<Flight> flightsFrom = new LinkedHashSet<>(flight1);
        flightsFrom.addAll(flight2);
        return flightsFrom;
    }

    public Set<Flight> searchTo(String toCity) {
        Set<Flight> flight1 = flightDatabase.getFlights().stream()
                .map(Flights::getFlight1)
                .filter(flights -> flights.getArrival().getAirport().equals(toCity))
                .collect(Collectors.toSet());
        Set<Flight> flight2 = flightDatabase.getFlights().stream()
                .map(Flights::getFlight2)
                .filter(flights -> flights.getArrival().getAirport().equals(toCity))
                .collect(Collectors.toSet());
        Set<Flight> flightsTo = new LinkedHashSet<>(flight1);
        flightsTo.addAll(flight2);
        return flightsTo;
    }

    public List<Flights> searchFromTo(String fromCity, String toCity) {
        List<Flights> flightsFromTo = flightDatabase.getFlights().stream()
                .filter(flights -> flights.getFlight1().getDeparture().getAirport().equals(fromCity)
                        && flights.getFlight2().getArrival().getAirport().equals(toCity))
                .collect(Collectors.toList());
        return flightsFromTo;
    }
}

