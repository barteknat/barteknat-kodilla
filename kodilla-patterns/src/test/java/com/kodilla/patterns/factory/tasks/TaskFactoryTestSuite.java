package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static com.kodilla.patterns.factory.tasks.TaskFactory.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    private final TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryShopping() {
        //Given
        Task shopping = factory.makeTask(SHOPPING);
        //When
        shopping.executeTask();
        //Then
        assertEquals("Bedroom Equipment", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        Task painting = factory.makeTask(PAINTING);
        //When
        painting.executeTask();
        //Then
        assertEquals("Operation Renovation", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        Task driving = factory.makeTask(DRIVING);
        //When
        driving.executeTask();
        //Then
        assertEquals("Holidays Holidays", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}

