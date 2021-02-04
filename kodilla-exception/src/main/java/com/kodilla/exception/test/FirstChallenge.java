package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            System.out.println("Division of a and b is: " + a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }
        finally {
            System.out.println("Multiplication is an inversion of division and for a and b it's:");
            return a * b;
        }
    }
}
