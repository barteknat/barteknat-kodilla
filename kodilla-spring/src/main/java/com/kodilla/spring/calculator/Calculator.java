package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        return display.displayValue(a + b);
    }

    public double sub(double a, double b) {
        return display.displayValue(a - b);
    }

    public double mul(double a, double b) {
        return display.displayValue(a * b);
    }

    public double div(double a, double b) {
        if (b == 0) return 0;
        return display.displayValue(a / b);
    }
}

