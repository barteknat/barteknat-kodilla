package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        System.out.println("Module 6. Introduction to software testing.");

        if (new Calculator().add(7, 10) == 17 && new Calculator().add(10, 7) == 17) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        if (new Calculator().subtract(7, 10) == -3 && new Calculator().subtract(10, 7) == 3) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }
    }
}
