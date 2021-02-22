package com.kodilla.rps.engine;

import com.kodilla.rps.model.Move;
import com.kodilla.rps.model.RoundResult;
import com.kodilla.rps.model.Statistics;
import com.kodilla.rps.strategy.EnemyStrategy;
import com.kodilla.rps.strategy.PlayerStrategy;
import com.kodilla.rps.uix.UserInterface;

import static com.kodilla.rps.model.RoundResult.*;

public class Round {

    private final int number;
    private final Statistics statistics;
    private final PlayerStrategy playerStrategy;
    private final EnemyStrategy enemyStrategy;
    private final RoundResolver roundResolver;
    private final UserInterface userInterface;

    public Round(Statistics statistics, UserInterface userInterface) {
        this.number = statistics.getRounds() + 1;
        this.statistics = statistics;
        this.userInterface = userInterface;
        this.playerStrategy = new PlayerStrategy(userInterface);
        this.enemyStrategy = new EnemyStrategy();
        this.roundResolver = new RoundResolver();
    }

    public RoundResult play() {
        userInterface.printRound(number);
        Move playerMove = playerStrategy.getMove();
        if (playerMove == Move.EXIT) return RoundResult.EXIT;
        if (playerMove == Move.NEW) return RoundResult.NEW;
        Move enemyMove = enemyStrategy.getMove();
        RoundResult result = roundResolver.resolve(playerMove, enemyMove);
        updateStatistics(result);
        userInterface.informRound(playerMove, enemyMove, result, statistics.getWins(), statistics.getLoses());
        return result;
    }

    public void updateStatistics(RoundResult result) {
        statistics.incrementRounds();
        if (result == DRAW) {
            statistics.incrementDraws();
        }
        if (result == WIN) {
            statistics.incrementWins();
        }
        if (result == LOSE) {
            statistics.incrementLoses();
        }
    }
}
