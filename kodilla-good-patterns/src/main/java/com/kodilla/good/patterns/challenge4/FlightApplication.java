package com.kodilla.good.patterns.challenge4;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;
import com.kodilla.good.patterns.challenge4.service.FlightSearch;
import com.kodilla.good.patterns.challenge4.service.Search;

public class FlightApplication {

    public static void main(String[] args) {

        FlightDatabase flightDatabase = new FlightDatabase();
        Search search = new FlightSearch(flightDatabase);
        search.searchFrom("Warsaw").forEach(System.out::println);
        System.out.println();
        search.searchTo("Rome").forEach(System.out::println);
        System.out.println();
        search.searchFromTo("Warsaw", "Sydney").forEach(System.out::println);
    }
}

