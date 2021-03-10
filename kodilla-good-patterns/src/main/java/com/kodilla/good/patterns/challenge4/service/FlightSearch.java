package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;

public interface FlightSearch {

    boolean search(FlightDatabase flightDatabase);

    static void printResult(String result) {
        System.out.println(result);
    }
}

