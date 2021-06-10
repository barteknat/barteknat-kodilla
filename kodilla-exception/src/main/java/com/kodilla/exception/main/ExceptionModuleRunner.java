package com.kodilla.exception.main;
import com.kodilla.exception.test.FirstChallenge;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        try {
            new FirstChallenge().divide(3,0);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        finally {
            System.out.println("Program is going on");
        }
    }
}
