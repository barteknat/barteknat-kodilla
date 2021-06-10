package com.kodilla.exception.test2;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyWillThrowException(1.9, 1.49));
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } finally {
            System.out.println("Program is going on.");
        }
    }
}
