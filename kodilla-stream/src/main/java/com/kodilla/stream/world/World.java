package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class World {

    private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        return getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        World world = (World) o;
        return Objects.equals(continents, world.continents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continents);
    }
}
