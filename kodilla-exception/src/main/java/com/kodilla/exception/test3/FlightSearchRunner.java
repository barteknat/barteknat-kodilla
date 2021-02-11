package com.kodilla.exception.test3;

import java.util.HashMap;
import java.util.Map;

public class FlightSearchRunner {

    public static void main(String[] args) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Rome", true);
        flights.put("Madrid", true);
        flights.put("London", false);
        flights.put("Paris", false);
        flights.put("Lisbon", true);
        flights.put("Berlin", false);

        try {
            if (new FlightSearch(flights).findFlight(new Flight("Warsaw", "Madrid")) == true) {
                System.out.println("Flight exist");
            }
            else {
                System.out.println("Airport closed");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry flight not found.");
        } finally {
            System.out.println("New flights soon.");
        }
    }
}
