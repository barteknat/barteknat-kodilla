package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;

import java.util.stream.Collectors;

public class FlightSearchFromTo implements FlightSearch {

    String fromCity;
    String toCity;

    public FlightSearchFromTo(String fromCity, String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public boolean search(FlightDatabase flightDatabase) {
        if (flightDatabase == null || fromCity == null || toCity == null) return false;
        String result = flightDatabase.initFlights().entrySet().stream()
                .filter(flight -> fromCity.equals(flight.getKey().getDeparture().getDepartureAirport()) &&
                        toCity.equals(flight.getValue().getArrival().getArrivalAirport()) &&
                        flight.getKey().getArrival().getArrivalAirport().equals(flight.getValue().getDeparture().getDepartureAirport()))
                .map(flight -> "Flight from " + flight.getKey().getDeparture().getDepartureAirport() +
                        " by " + flight.getKey().getArrival().getArrivalAirport() +
                        " to " + flight.getValue().getArrival().getArrivalAirport())
                .collect(Collectors.joining("\n"));
        if (result.isEmpty()) return false;
        FlightSearch.printResult(result);
        return true;
    }
}

