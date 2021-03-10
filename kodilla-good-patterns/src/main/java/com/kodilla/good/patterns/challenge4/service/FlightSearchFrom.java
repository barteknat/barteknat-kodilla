package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;

import java.util.stream.Collectors;

public class FlightSearchFrom implements FlightSearch {

    String fromCity;

    public FlightSearchFrom(String fromCity) {
        this.fromCity = fromCity;
    }

    public boolean search(FlightDatabase flightDatabase) {
        if (flightDatabase == null || fromCity == null) return false;
        String result = flightDatabase.initFlights().entrySet().stream()
                .filter(flight -> fromCity.equals(flight.getKey().getDeparture().getDepartureAirport()))
                .map(flight -> flight.getKey().getDeparture().getDepartureAirport() + " to " + flight.getKey().getArrival().getArrivalAirport())
                .collect(Collectors.joining("\n"));
        if (result.isEmpty()) return false;
        FlightSearch.printResult(result);
        return true;
    }
}

