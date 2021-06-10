package com.kodilla.stream.lambda;

public class ExpressionExecutor {

    public void executeExpression(double a, double b, MathExpression mathExpression) {
        System.out.println("result is: " + mathExpression.calculateExpression(a, b));
    }
}
