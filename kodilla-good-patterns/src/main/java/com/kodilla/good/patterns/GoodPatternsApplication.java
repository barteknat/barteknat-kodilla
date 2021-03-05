package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoodPatternsApplication {

    public static void main(String[] args) {
        String movies = new MovieStore().getMovies().values().stream()
                .flatMap(List::stream)
                .collect(Collectors.joining("!"));
        Stream.of(movies)
                .forEach(System.out::println);
    }
}

