package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddList = new ArrayList<>();
        if (numbers == null || numbers.isEmpty()) return new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) oddList.add(number);
        }
        return oddList;
    }
}
