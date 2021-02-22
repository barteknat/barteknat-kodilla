package com.kodilla.rps.engine;

import com.kodilla.rps.model.*;
import com.kodilla.rps.uix.UserInterface;

import static com.kodilla.rps.model.RoundResult.*;

public class Game {

    private final UserInterface userInterface;
    private final Statistics statistics;
    private GameDefinition definition;

    public Game(UserInterface userInterface) {
        this.userInterface = userInterface;
        this.statistics = new Statistics();
    }

    public GameResult start() {
        userInterface.printMenu();
        definition = getGameDefinition();
        userInterface.printShortMenu();
        RoundResult result = RoundResult.DRAW;
        while (shouldPlay(definition, result)) {
            result = new Round(statistics, userInterface).play();
        }
        if (result != RoundResult.EXIT && result != RoundResult.NEW) {
            userInterface.informGame(definition, statistics);
        }
        if (result == RoundResult.EXIT) {
            return GameResult.EXIT;
        }
        if (result == RoundResult.NEW) {
            statistics.decrementStatistics();
            return GameResult.NEXT;
        }
        statistics.decrementStatistics();
        return GameResult.END;
    }

    private boolean shouldPlay(GameDefinition definition, RoundResult result) {
        if (result == EXIT) {
            boolean exit = userInterface.confirmExit();
            if (exit) {
                return false;
            } else {
                return statistics.hasNextRound(definition.getRounds());
            }
        }
        if (result == NEW) {
            boolean exit = userInterface.confirmNewGame();
            if (exit) {
                return false;
            } else {
                return statistics.hasNextRound(definition.getRounds());
            }
        }
        return statistics.hasNextRound(definition.getRounds());
    }

    private GameDefinition getGameDefinition() {
        userInterface.printAskForUserName();
        String userName = userInterface.getUserName();
        userInterface.printAskForRoundsToWin();
        int roundCount = userInterface.getRoundCount();
        return new GameDefinition(userName, roundCount);
    }

    public String getUsername() {
        return definition.getUsername();
    }
}
