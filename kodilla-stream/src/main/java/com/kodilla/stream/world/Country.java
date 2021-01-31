package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {

    private final BigDecimal peopleQuantity;

    public Country(BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(peopleQuantity, country.peopleQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleQuantity);
    }
}
