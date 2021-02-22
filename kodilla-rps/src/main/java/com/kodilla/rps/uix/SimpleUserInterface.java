package com.kodilla.rps.uix;

import com.kodilla.rps.model.GameDefinition;
import com.kodilla.rps.model.Move;
import com.kodilla.rps.model.RoundResult;
import com.kodilla.rps.model.Statistics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleUserInterface implements UserInterface {

    private static Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        System.out.println("Welcome to the RPS game!!! \nThe rules: \n-> game for two players \n-> on each round player and enemy choose one move of: ROCK, PAPER, SCISSORS \n-> ROCK beats SCISSORS, SCISSORS beats PAPER, PAPER beats ROCK \n-> draw is when both moves are the same");
    }

    public void printAskForUserName() {
        System.out.println("Give your name:");
    }

    public void printAskForRoundsToWin() {
        System.out.println("Give number of rounds to win:");
    }

    public void printShortMenu() {
        System.out.println("Keyboard controllers: \n[1] -> rock \n[2] -> paper \n[3] -> scissors \n[x] -> exit \n[n] -> new game");
    }

    public void printWrongArgument() {
        System.out.println("Wrong argument, try again");
    }

    public char getMove() {
        return scanner.next().charAt(0);
    }

    public String getUserName() {
        return scanner.next();
    }

    public int getRoundCount() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    public void informRound(Move playerMove, Move enemyMove, RoundResult result, int playerWins, int enemyWins) {
        System.out.println("Player:        " + playerMove +
                "\nEnemy:         " + enemyMove +
                "\nPlayer result: " + result +
                "\nPlayer wins:   " + playerWins +
                "\nEnemy wins:    " + enemyWins);
    }

    public void informGame(GameDefinition definition, Statistics statistics) {
        System.out.println("\nThe winner is: " + statistics.whoWins() + "\n" +
                definition + "\n" +
                statistics);
    }

    public boolean confirmExit() {
        System.out.println("Are you sure you want to quit? [y] / [n]");
        char exit = scanner.next().charAt(0);
        while (exit != 'y' && exit != 'n') {
            System.out.println("Wrong argument, try again");
            exit = scanner.next().charAt(0);
        }
        if (exit == 'y') return true;
        return false;
    }

    public boolean confirmNewGame() {
        System.out.println("Are you sure you want to play new game? [y] / [n]");
        char newGame = scanner.next().charAt(0);
        while (newGame != 'y' && newGame != 'n') {
            System.out.println("Wrong argument, try again");
            newGame = scanner.next().charAt(0);
        }
        if (newGame == 'y') return true;
        return false;
    }

    public boolean confirmOnceAgain() {
        System.out.println("Do you want to play again? [y] / [n]");
        char onceAgain = scanner.next().charAt(0);
        while (onceAgain != 'y' && onceAgain != 'n') {
            if (getRoundCount() != 0) {
                System.out.println("Wrong argument, try again");
                onceAgain = scanner.next().charAt(0);
            }
            onceAgain = scanner.next().charAt(0);
        }
        if (onceAgain == 'y') return true;
        return false;
    }

    public void printRound(int number) {
        System.out.println("-------------------- \nRound: " + number + "\nMake your move:");

    }

    public void thankYou(String username) {
        System.out.println("\n" + username + " thank you for playing. Goodbye.");
    }
}
