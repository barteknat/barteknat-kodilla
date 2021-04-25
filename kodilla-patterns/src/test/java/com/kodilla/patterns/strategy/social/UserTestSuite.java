package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User robert = new YGeneration("Robert Doe");
        User roger = new ZGeneration("Roger Kowalski");
        //When
        String johnPostsOn = john.sharePost();
        String robertPostsOn = robert.sharePost();
        String rogerPostsOn = roger.sharePost();
        //Then
        assertEquals("Facebook", johnPostsOn);
        assertEquals("Twitter", robertPostsOn);
        assertEquals("Snapchat", rogerPostsOn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Smith");
        //When
        String johnPostsOn = john.sharePost();
        System.out.println("John is posting on " + johnPostsOn);
        john.setSocialPublisher(new TwitterPublisher());
        johnPostsOn = john.sharePost();
        System.out.println("John changed social network and now posts on " + johnPostsOn);
        //Then
        assertEquals("Twitter", johnPostsOn);
    }
}

