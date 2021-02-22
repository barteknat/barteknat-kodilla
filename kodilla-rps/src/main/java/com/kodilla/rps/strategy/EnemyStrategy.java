package com.kodilla.rps.strategy;

import com.kodilla.rps.model.Move;

import java.util.Random;

public class EnemyStrategy implements Strategy {

    private static final Random random = new Random();

    @Override
    public Move getMove() {
        int enemyChoice = random.nextInt(3) + 1;
        if (enemyChoice == 1) return Move.ROCK;
        if (enemyChoice == 2) return Move.PAPER;
        return Move.SCISSORS;
    }
}