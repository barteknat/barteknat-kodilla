package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        double average = 0;
        if (numbers != null) {
            if (numbers.length > 0) {
                int[] finalNumbers = numbers;
                IntStream.range(0, finalNumbers.length)
                        .map(n -> finalNumbers[n])
                        .forEach(System.out::println);
                average = IntStream.range(0, finalNumbers.length)
                        .map(n -> finalNumbers[n])
                        .average().getAsDouble();
            }
        }
        return average;
    }
}
