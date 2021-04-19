package com.kodilla.rps.engine;

import com.kodilla.rps.model.GameResult;
import com.kodilla.rps.uix.UserInterface;

public class GameRunner {

    private final UserInterface userInterface;

    public GameRunner(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public void run() {
        Game game = new Game(userInterface);
        GameResult result;
        boolean end = false;
        while (!end) {
            result = game.start();
            if (result == GameResult.EXIT) {
                userInterface.thankYou(game.getUsername());
                end = true;
            }
            if (result == GameResult.END) {
                if (!userInterface.confirmOnceAgain()) {
                    userInterface.thankYou(game.getUsername());
                    end = true;
                }
            }
        }
    }
}

