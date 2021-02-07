package com.kodilla.exception.test3;

public class FlightSearchRunner {

    public static void main(String[] args) {

        try {
            new FlightSearch().findFlight(new Flight("Warsaw", "Tokyo"));
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry flight not found.");
        } finally {
            System.out.println("New flights soon.");
        }
    }
}
