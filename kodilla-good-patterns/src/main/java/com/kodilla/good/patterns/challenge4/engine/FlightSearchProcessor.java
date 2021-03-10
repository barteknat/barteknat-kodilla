package com.kodilla.good.patterns.challenge4.engine;

import com.kodilla.good.patterns.challenge4.database.FlightDatabase;
import com.kodilla.good.patterns.challenge4.service.FlightSearch;

public class FlightSearchProcessor {

    FlightSearch flightSearch;
    FlightDatabase flightDatabase;

    public FlightSearchProcessor(FlightSearch flightSearch) {
        this.flightSearch = flightSearch;
        flightDatabase = new FlightDatabase();
    }

    public boolean processor() {
        flightDatabase.initFlights();
        if (flightSearch.search(flightDatabase)) return true;
        return false;
    }
}
