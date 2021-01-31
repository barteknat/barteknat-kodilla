package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{

    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();
        stubResult.put("Rzesow", 25.2);
        stubResult.put("Krakow", 26.2);
        stubResult.put("Warszawa", 22.2);
        stubResult.put("Lublin", 27.2);
        stubResult.put("Zamosc", 23.2);

        return stubResult;
    }
}
