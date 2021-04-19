package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.model.Flight;
import com.kodilla.good.patterns.challenge4.model.Flights;

import java.util.List;
import java.util.Set;

public interface Search {

    Set<Flight> searchFrom(String fromCity);

    Set<Flight> searchTo(String toCity);

    List<Flights> searchFromTo(String fromCity, String toCity);
}

