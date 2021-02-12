package com.kodilla.exception.test3;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchRunner {

    public static void main(String[] args) throws RouteNotFoundException {
        FlightSearch flightSearch = new FlightSearch(initFlightsMap());
        Flight flight = new Flight("Warsaw", "Lisbon");
        try {
            if (flightSearch.findFlight(flight)) {
                System.out.println("It is possible to get to " + flight.getArrivalAirport());
            } else {
                System.out.println("It is impossible to get to " + flight.getArrivalAirport());
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Flight to " + flight.getArrivalAirport() + " not found in database");
        } finally {
            System.out.println("Thank you for using our services");
        }
    }

    private static Map<String, Boolean> initFlightsMap() {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Rome", true);
        flights.put("Madrid", true);
        flights.put("London", false);
        flights.put("Paris", false);
        flights.put("Lisbon", true);
        flights.put("Berlin", false);
        return flights;
    }
}
