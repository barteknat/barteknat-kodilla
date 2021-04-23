package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User robert = new YGeneration("Robert Doe");
        User roger = new ZGeneration("Roger Kowalski");

        //When & Then
        john.sharePost();
        robert.sharePost();
        roger.sharePost();
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Smith");

        //When & Then
        john.sharePost();
        john.setSocialPublisher(new TwitterPublisher());
        john.sharePost();
    }
}

