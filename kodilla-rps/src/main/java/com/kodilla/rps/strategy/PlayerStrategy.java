package com.kodilla.rps.strategy;

import com.kodilla.rps.model.Move;
import com.kodilla.rps.uix.UserInterface;

import static com.kodilla.rps.model.Move.*;

public class PlayerStrategy implements Strategy {

    private final UserInterface userInterface;

    public PlayerStrategy(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public Move getMove() {
        char playerChoice = userInterface.getMove();
        while (playerChoice != '1' && playerChoice != '2' && playerChoice != '3' && playerChoice != 'x' && playerChoice != 'n') {
            userInterface.printWrongArgument();
            playerChoice = userInterface.getMove();
        }
        if (playerChoice == '1') return ROCK;
        if (playerChoice == '2') return PAPER;
        if (playerChoice == '3') return SCISSORS;
        if (playerChoice == 'x') return EXIT;
        return NEW;
    }
}

