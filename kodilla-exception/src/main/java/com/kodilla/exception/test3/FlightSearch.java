package com.kodilla.exception.test3;

import java.util.Map;

public class FlightSearch {

    private final Map<String, Boolean> flights;

    public FlightSearch(Map<String, Boolean> flights) {
        this.flights = flights;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flights.containsKey(flight.getArrivalAirport()) && flights.get(flight.getArrivalAirport()) == false) {
            System.out.println("Airport closed");
        }
        else if (flights.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight exists");
        }
        else {
            throw new RouteNotFoundException();
        }
    }
}
