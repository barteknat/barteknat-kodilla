package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static com.kodilla.patterns.factory.tasks.Tasks.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    private final ShoppingTaskDTO shoppingTaskDTO = new ShoppingTaskDTO();
    private final PaintingTaskDTO paintingTaskDTO = new PaintingTaskDTO();
    private final DrivingTaskDTO drivingTaskDTO = new DrivingTaskDTO();
    private final TaskFactory factory = new TaskFactory(shoppingTaskDTO, paintingTaskDTO, drivingTaskDTO);

    @Test
    void testFactoryShopping() {
        //Given
        shoppingTaskDTO.setTaskParameters("Bedroom Equipment", "bed", 1);
        Task shopping1 = factory.makeTask(SHOPPING);
        shoppingTaskDTO.setTaskParameters("Kitchen Equipment", "oven", 1);
        Task shopping2 = factory.makeTask(SHOPPING);
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
        paintingTaskDTO.setTaskParameters("Renovation", "green", "fence");
        Task painting = factory.makeTask(PAINTING);
        //When
        painting.executeTask();
        //Then
        assertEquals("Renovation", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        drivingTaskDTO.setTaskParameters("Holidays", "Sosnowiec", "car");
        Task driving = factory.makeTask(DRIVING);
        //When
        driving.executeTask();
        //Then
        assertEquals("Holidays", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}

