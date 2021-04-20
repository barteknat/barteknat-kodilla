package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = Logger.LOG;
        logger.log("/java/1.01.2001");
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("/java/1.01.2001", lastLog);
    }
}

