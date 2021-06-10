package com.kodilla.good.patterns.challenge2.model;

import java.util.Objects;

public class OrderDto {

    private final User user;
    private final boolean orderConfirmed;

    public OrderDto(User user, boolean orderConfirmed) {
        this.user = user;
        this.orderConfirmed = orderConfirmed;
    }

    @Override
    public String toString() {
        return "{" + "user=" + user.userName +
                " " + user.userSurname +
                ", orderConfirmed=" + orderConfirmed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDto orderDto = (OrderDto) o;
        return orderConfirmed == orderDto.orderConfirmed && Objects.equals(user, orderDto.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, orderConfirmed);
    }
}

