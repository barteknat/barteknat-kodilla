package com.kodilla.spring.calculator;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testAdd() {
        //Given

        //When
        double score = calculator.add(5.5, 4.5);

        //Then
        assertEquals(5.5 + 4.5, score);
    }

    @Test
    void testSub() {
        //Given

        //When
        double score = calculator.sub(5.5, 4.5);

        //Then
        assertEquals(5.5 - 4.5, score);
    }

    @Test
    void testMul() {
        //Given

        //When
        double score = calculator.mul(2.0, 4.5);

        //Then
        assertEquals(2.0 * 4.5, score);
    }

    @Test
    void testDiv() {
        //Given

        //When
        double score = calculator.div(3, 2);

        //Then
        assertEquals(3.0 / 2, score);
    }
}

