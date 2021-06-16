package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Homework student1Homework = new Student1Homework();
        Homework student2Homework = new Student2Homework();
        Homework student3Homework = new Student3Homework();
        Mentor mentor1 = new Mentor1();
        Mentor mentor2 = new Mentor2();
        student1Homework.registryObserver(mentor1);
        student2Homework.registryObserver(mentor2);
        student3Homework.registryObserver(mentor2);
        //When
        student1Homework.addTask("Task1");
        student1Homework.addTask("Task2");
        student1Homework.addTask("Task3");
        student2Homework.addTask("Task1");
        student2Homework.addTask("Task2");
        student3Homework.addTask("Task1");
        student3Homework.addTask("Task2");
        student3Homework.addTask("Task3");
        student3Homework.addTask("Task4");
        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(6, mentor2.getUpdateCount());
    }
}
