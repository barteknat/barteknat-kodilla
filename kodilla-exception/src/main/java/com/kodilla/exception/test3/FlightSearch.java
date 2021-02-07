package com.kodilla.exception.test3;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Rome", true);
        if (flight != null) {
            for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
                if (!entry.getKey().equals(flight.getArrivalAirport())) {
                    throw new RouteNotFoundException("No arrival airport.");
                } else if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue() == false) {
                    System.out.println("The airport is temporary closed.");
                } else {
                    System.out.println("The flight is available.");
                }
            }
        } else {
            throw new RouteNotFoundException("Object flight was null.");
        }
    }
}
