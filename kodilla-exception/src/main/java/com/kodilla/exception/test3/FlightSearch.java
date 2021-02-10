package com.kodilla.exception.test3;

import java.util.Map;

public class FlightSearch {

    private final Map<String, Boolean> flights;

    public FlightSearch(Map<String, Boolean> flights) {
        this.flights = flights;
    }

    public String findFlight(Flight flight) throws RouteNotFoundException {
        try {
            if (flights.get(flight.getArrivalAirport())) return "Flight exist";
            return "Airport closed";
        } catch (NullPointerException e) {
            throw new RouteNotFoundException();
        }
    }
}
