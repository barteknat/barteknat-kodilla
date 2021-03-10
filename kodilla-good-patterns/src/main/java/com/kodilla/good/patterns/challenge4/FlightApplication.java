package com.kodilla.good.patterns.challenge4;

import com.kodilla.good.patterns.challenge4.engine.FlightSearchProcessor;
import com.kodilla.good.patterns.challenge4.service.FlightSearchFromTo;
import com.kodilla.good.patterns.challenge4.service.FlightSearch;

public class FlightApplication {

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearchFromTo("Warsaw", "Madrid");
        FlightSearchProcessor flightSearchProcessor = new FlightSearchProcessor(flightSearch);
        flightSearchProcessor.processor();
    }
}

