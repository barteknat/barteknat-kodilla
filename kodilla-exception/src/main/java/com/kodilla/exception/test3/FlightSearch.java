package com.kodilla.exception.test3;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private final Map<String, Boolean> flights = new HashMap<>();

    public FlightSearch() {
        flights.put("Rome", true);
        flights.put("Madrid", true);
        flights.put("London", false);
        flights.put("Berlin", true);
        flights.put("Paris", false);
        flights.put("Antwerp", false);
        flights.put("Lisbon", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = "";
        boolean airportOpen = true;
        if (flight != null) {
            for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    arrivalAirport = entry.getKey();
                    airportOpen = entry.getValue();
                }
            }
            if (airportOpen == false) {
                System.out.println("Airport is temporary closed");
            } else if (arrivalAirport.equals(flight.getArrivalAirport())) {
                System.out.println("Flight is available");
            } else {
                throw new RouteNotFoundException("No arrival airport");
            }
        } else {
            throw new RouteNotFoundException("Object flight was null.");
        }
    }
}
