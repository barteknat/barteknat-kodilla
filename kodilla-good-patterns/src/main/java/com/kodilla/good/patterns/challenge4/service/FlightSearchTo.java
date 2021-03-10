package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;

import java.util.stream.Collectors;

public class FlightSearchTo implements FlightSearch {

    String toCity;

    public FlightSearchTo(String toCity) {
        this.toCity = toCity;
    }

    public boolean search(FlightDatabase flightDatabase) {
        if (flightDatabase == null || toCity == null) return false;
        String result = flightDatabase.initFlights().entrySet().stream()
                .filter(flight -> toCity.equals(flight.getKey().getArrival().getArrivalAirport()))
                .map(flight -> flight.getKey().getDeparture().getDepartureAirport() + " to " + flight.getKey().getArrival().getArrivalAirport())
                .collect(Collectors.joining("\n"));
        if (result.isEmpty()) return false;
        FlightSearch.printResult(result);
        return true;
    }
}

