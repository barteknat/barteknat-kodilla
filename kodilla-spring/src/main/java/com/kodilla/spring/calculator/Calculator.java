package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    public void add(double a, double b) {
        display.displayValue(a + b);
    }

    public void sub(double a, double b) {
        display.displayValue(a - b);
    }

    public void mul(double a, double b) {
        display.displayValue(a * b);
    }

    public void div(double a, double b) {
        if (b == 0) return;
        display.displayValue(a / b);
    }
}

