package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;

public class Continent {

    private final String name;
    private final List<Country> countries;

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(name, continent.name) && Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countries);
    }
}
