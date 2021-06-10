package com.kodilla.exception.test2;

public class SecondChallenge {

    public String probablyWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}
