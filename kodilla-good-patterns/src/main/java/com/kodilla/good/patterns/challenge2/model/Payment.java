package com.kodilla.good.patterns.challenge2.model;

import java.util.Objects;

public class Payment {

    private final boolean paid;

    public Payment(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "paid=" + paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return paid == payment.paid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(paid);
    }

    public boolean getPaid() {
        return paid;
    }
}

