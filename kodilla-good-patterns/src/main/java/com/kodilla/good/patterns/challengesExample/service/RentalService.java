package com.kodilla.good.patterns.challengesExample.service;

import com.kodilla.good.patterns.challengesExample.model.User;

import java.time.LocalDateTime;

public interface RentalService {

    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
