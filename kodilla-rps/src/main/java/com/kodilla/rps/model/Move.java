package com.kodilla.rps.model;

public enum Move {

    ROCK,
    PAPER,
    SCISSORS,
    EXIT,
    NEW;

    public static Move getByOrdinal(int ordinal) {
        return Move.values()[ordinal];
    }
}

