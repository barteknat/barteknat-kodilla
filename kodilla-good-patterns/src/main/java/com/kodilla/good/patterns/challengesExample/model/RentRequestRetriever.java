package com.kodilla.good.patterns.challengesExample.model;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {
        User user = new User("John", "Wekl");
        LocalDateTime rentFrom = LocalDateTime.of(2020,8,1,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2020, 8, 10, 12, 0);
        return new RentRequest(user, rentFrom, rentTo);
    }
}
