package com.kodilla.rps.strategy;

import com.kodilla.rps.model.Move;

import java.util.Random;

public class EnemyStrategy implements Strategy {

    private static final Random random = new Random();

    @Override
    public Move getMove() {
        return Move.getByOrdinal(random.nextInt(3));
    }
}

