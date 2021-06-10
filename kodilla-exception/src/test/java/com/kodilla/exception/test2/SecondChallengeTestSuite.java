package com.kodilla.exception.test2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void probablyWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2, 1.4)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(0.9, 1.6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(1, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1.9, 1.4)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1, 1.6))
        );
    }
}
