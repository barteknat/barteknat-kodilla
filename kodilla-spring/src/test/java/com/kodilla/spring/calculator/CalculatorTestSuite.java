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

        //When & Then
        calculator.add(5.5, 4.5);
    }

    @Test
    void testSub() {
        //Given

        //When & Then
        calculator.sub(5.5, 4.5);
    }

    @Test
    void testMul() {
        //Given

        //When & Then
        calculator.mul(2.0, 4.5);
    }

    @Test
    void testDiv() {
        //Given

        //When & Then
        calculator.div(3, 2);
    }
}

