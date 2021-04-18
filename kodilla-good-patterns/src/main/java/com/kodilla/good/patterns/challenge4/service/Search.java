package com.kodilla.good.patterns.challenge4.service;

import com.kodilla.good.patterns.challenge4.model.Flight;

import java.util.List;

public interface Search {

    List<Flight> searchFrom(String fromCity);

    List<Flight> searchTo(String toCity);

    List<Flight> searchFromTo(String fromCity, String toCity);

}

