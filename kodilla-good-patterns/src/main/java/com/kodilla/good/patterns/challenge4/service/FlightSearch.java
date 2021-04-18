package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;
import com.kodilla.good.patterns.challenge4.model.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch implements Search {

    FlightDatabase flightDatabase;

    public FlightSearch(FlightDatabase flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

    public List<Flight> searchFrom(String fromCity) {
        List<Flight> flightsFrom = flightDatabase.getFlights().stream()
                .filter(flight -> flight.getDeparture().getDepartureAirport().equals(fromCity))
                .collect(Collectors.toList());
        return flightsFrom;
    }

    public List<Flight> searchTo(String toCity) {
        List<Flight> flightsTo = flightDatabase.getFlights().stream()
                .filter(flight -> flight.getArrival().getArrivalAirport().equals(toCity))
                .collect(Collectors.toList());
        return flightsTo;
    }

    public List<Flight> searchFromTo(String fromCity, String toCity) {
        List<Flight> flightsFromTo = new ArrayList<>();
        for (Flight flight1 : flightDatabase.getFlights()) {
            for (Flight flight2 : flightDatabase.getFlights()) {
                if (isFlight(fromCity, toCity, flight1, flight2)) {
                    flightsFromTo.add(flight1);
                    flightsFromTo.add(flight2);
                }
            }
        }
        return flightsFromTo;
    }

    private boolean isFlight(String fromCity, String toCity, Flight flight1, Flight flight2) {
        return flight1.getDeparture().getDepartureAirport().equals(fromCity) && flight2.getArrival().getArrivalAirport().equals(toCity) &&
                flight1.getArrival().getArrivalAirport().equals(flight2.getDeparture().getDepartureAirport());
    }
}

