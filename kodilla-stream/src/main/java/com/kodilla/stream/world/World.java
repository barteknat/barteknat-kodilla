package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class World {

    private final List<List<Country>> continentList = Arrays.asList(
            new Continent().europe,
            new Continent().asia,
            new Continent().northAmerica);

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(c -> c.stream())
                .map(b -> b.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
