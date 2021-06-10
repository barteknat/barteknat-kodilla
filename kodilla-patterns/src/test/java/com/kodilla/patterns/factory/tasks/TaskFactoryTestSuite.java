package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static com.kodilla.patterns.factory.tasks.TaskType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        Task shopping1 = new TaskFactory(new TaskDTO("Bedroom Equipment", "bed", 1.0)).makeTask(SHOPPING);
        Task shopping2 = new TaskFactory(new TaskDTO("Kitchen Equipment", "oven", 1.0)).makeTask(SHOPPING);
        //When
        shopping1.executeTask();
        shopping2.executeTask();
        //Then
        assertEquals("Bedroom Equipment", shopping1.getTaskName());
        assertEquals("Kitchen Equipment", shopping2.getTaskName());
        assertTrue(shopping1.isTaskExecuted());
        assertTrue(shopping2.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        Task painting = new TaskFactory(new TaskDTO("Renovation", "green", "fence")).makeTask(PAINTING);
        //When
        painting.executeTask();
        //Then
        assertEquals("Renovation", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        Task driving = new TaskFactory(new TaskDTO("Holidays", "Sosnowiec", "car")).makeTask(DRIVING);
        //When
        driving.executeTask();
        //Then
        assertEquals("Holidays", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}

