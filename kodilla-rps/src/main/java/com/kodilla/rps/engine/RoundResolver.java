package com.kodilla.rps.engine;

import com.kodilla.rps.model.Move;
import com.kodilla.rps.model.RoundResult;

import static com.kodilla.rps.model.Move.*;
import static com.kodilla.rps.model.RoundResult.*;

public class RoundResolver {

    public RoundResult resolve(Move playerMove, Move enemyMove) {
        if (playerMove == enemyMove) return DRAW;
        if (playerMove == ROCK && enemyMove == SCISSORS ||
                playerMove == PAPER && enemyMove == ROCK ||
                playerMove == SCISSORS && enemyMove == PAPER) return WIN;
        return LOSE;
    }
}

