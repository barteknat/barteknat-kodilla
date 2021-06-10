package com.kodilla.good.patterns.challengesExample.repository;

import com.kodilla.good.patterns.challengesExample.model.User;

import java.time.LocalDateTime;

public interface RentalRepository {

    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
