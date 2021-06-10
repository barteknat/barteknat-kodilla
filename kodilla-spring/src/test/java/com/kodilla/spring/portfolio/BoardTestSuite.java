package com.kodilla.spring.portfolio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;

    @Test
    void testAddTaskToToDoList() {
        //Given

        //When
        board.setToDoList(Arrays.asList("task1"));

        //Then
        assertEquals("task1", board.toDoList.tasks.get(0));
    }

    @Test
    void testAddTaskToInProgressList() {
        //Given

        //When
        board.setInProgressList(Arrays.asList("task2"));

        //Then
        assertEquals("task2", board.inProgressList.tasks.get(0));
    }

    @Test
    void testAddTaskToDoneList() {
        //Given

        //When
        board.setDoneList(Arrays.asList("task3"));

        //Then
        assertEquals("task3", board.doneList.tasks.get(0));
    }
}

