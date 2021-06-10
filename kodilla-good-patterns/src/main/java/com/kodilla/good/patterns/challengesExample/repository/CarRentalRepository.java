package com.kodilla.good.patterns.challengesExample.repository;

import com.kodilla.good.patterns.challengesExample.model.User;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository{

    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
