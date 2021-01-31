package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private final Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0;
        if (temperatures.getTemperatures().size() == 0) return 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double medianTemperature() {
        List<Double> temperatureList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperatureList.add(temperature.getValue());
        }
        Collections.sort(temperatureList);
        double median = 0;
        if (temperatureList.size() == 0) return 0;
        if (temperatureList.size() % 2 == 0) return median = (temperatureList.get(temperatureList.size() / 2 - 1) + temperatureList.get(temperatureList.size() / 2)) / 2;
        return median = temperatureList.get(temperatureList.size() / 2);
    }
}
