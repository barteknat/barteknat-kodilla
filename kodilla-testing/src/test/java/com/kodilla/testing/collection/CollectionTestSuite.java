package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("If list passed as argument to exterminate(list) is empty, " +
            "the exterminate method should return also empty list"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> list = Arrays.asList();
        //When
        List<Integer> result = new OddNumbersExterminator().exterminate(list);
        //Then
        Assertions.assertEquals(Arrays.asList(), result);
    }

    @DisplayName("If normalList passed as argument to exterminate(list) contains odd and even numbers, " +
            "the exterminate method should return list with odd numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> normalList = Arrays.asList(-8, 1, 2, 3, 4, 5, 4, 3, 2, 1, 10);
        //When
        List<Integer> result = exterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(Arrays.asList(-8, 2, 4, 4, 2, 10), result);
    }
}
