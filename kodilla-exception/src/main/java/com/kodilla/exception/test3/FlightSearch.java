package com.kodilla.exception.test3;

import java.util.Map;

public class FlightSearch {

    private final Map<String, Boolean> flights;

    public FlightSearch(Map<String, Boolean> flights) {
        this.flights = flights;
    }

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (flights.containsKey(flight.getArrivalAirport())) return flights.get(flight.getArrivalAirport());
        throw new RouteNotFoundException();
    }
}
