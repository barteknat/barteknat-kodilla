package com.kodilla.rps;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    /*

    public static void main(String[] args) throws IOException {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the RPS game \nEnter your name:");
        String name = scanner.next();
        System.out.println(name + ", enter number of games to win:");
        int settleWins;
        try { settleWins = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
            return;
        }
        System.out.println("We are playing to: " + settleWins + " wins \nKeyboard controllers: \n[1] -> rock \n[2] -> paper \n[3] -> scissors \nLET THE GAME BEGIN!!!");
        int userChoice;
        int computerChoice;
        int winningRoundsPlayer1 = 0;
        int winningRoundsPlayer2 = 0;
        boolean end = false;

        while (!end) {
            System.out.println("Make your move:");
            try { userChoice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
                return;
            }
            if (userChoice > 0 && userChoice < 4) {
                if (userChoice == 1) {
                    userChoice = 1;
                    System.out.println("You:      rock");
                    computerChoice = random.nextInt(3) + 1;
                    if (computerChoice == 1) {
                        computerChoice = 1;
                        System.out.println("Computer: rock");
                    } else if (computerChoice == 2) {
                        computerChoice = 2;
                        System.out.println("Computer: paper");
                    } else {
                        computerChoice = 0;
                        System.out.println("Computer: scissors");
                    }
                } else if (userChoice == 2) {
                    userChoice = 2;
                    System.out.println("You:      paper");
                    computerChoice = random.nextInt(3) + 1;
                    if (computerChoice == 1) {
                        computerChoice = 1;
                        System.out.println("Computer: rock");
                    } else if (computerChoice == 2) {
                        computerChoice = 2;
                        System.out.println("Computer: paper");
                    } else {
                        computerChoice = 3;
                        System.out.println("Computer: scissors");
                    }
                } else {
                    userChoice = 1;
                    System.out.println("You:      scissors");
                    computerChoice = random.nextInt(3) + 1;
                    if (computerChoice == 1) {
                        computerChoice = 2;
                        System.out.println("Computer: rock");
                    } else if (computerChoice == 2) {
                        computerChoice = 0;
                        System.out.println("Computer: paper");
                    } else {
                        computerChoice = 1;
                        System.out.println("Computer: scissors");
                    }
                }

                if (userChoice > computerChoice) {
                    System.out.println("You won!\n");
                    winningRoundsPlayer1++;
                    System.out.println("You:      " + winningRoundsPlayer1 + "\n" + "Computer: " + winningRoundsPlayer2 + "\n");
                } else if (userChoice < computerChoice) {
                    System.out.println("You lost!\n");
                    winningRoundsPlayer2++;
                    System.out.println("You:      " + winningRoundsPlayer1 + "\n" + "Computer: " + winningRoundsPlayer2 + "\n");
                } else {
                    System.out.println("Draw\n");
                    System.out.println("You:      " + winningRoundsPlayer1 + "\n" + "Computer: " + winningRoundsPlayer2 + "\n");
                }
            }
            if (winningRoundsPlayer1 == settleWins || winningRoundsPlayer2 == settleWins) {
                if (winningRoundsPlayer1 > winningRoundsPlayer2) {
                    System.out.println("CONGRATULATIONS " + name.toUpperCase() + "!!! YOU HAVE WON THE GAME!!!");
                }
                else {
                    System.out.println("GAME OVER");
                }
                System.out.println("[n] -> new game \n[x] -> quit game");
                userChoice = scanner.next().charAt(0);
                if (userChoice == 'n') {
                    System.out.println("are you sure? [y] / [n]");
                    userChoice = scanner.next().charAt(0);
                    if (userChoice == 'y') {
                        winningRoundsPlayer1 = 0;
                        winningRoundsPlayer2 = 0;
                        try {
                            System.out.println("enter number of games to win:");
                            settleWins = scanner.nextInt();
                            System.out.println("We are playing to: " + settleWins + " wins \nKeyboard controllers: \n[1] -> rock \n[2] -> paper \n[3] -> scissors \nLET THE GAME BEGIN!!!");
                        }
                        catch (InputMismatchException e) {
                            System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
                            return;
                        }
                    }
                    else if (userChoice == 'n') {
                        System.out.println("good bye " + name);
                        end = true;
                    }
                    else {
                        System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
                        end = true;
                    }
                }
                else if (userChoice == 'x') {
                    System.out.println("are you sure you want to quit? [y] / [n]");
                    userChoice = scanner.next().charAt(0);
                    if (userChoice == 'y') {
                        System.out.println("good bye " + name);
                        end = true;
                    }
                    else if (userChoice == 'n') {
                        System.out.println("do you want to play in a new game? [y] / [n]");
                        userChoice = scanner.next().charAt(0);
                        if (userChoice == 'y') {
                            winningRoundsPlayer1 = 0;
                            winningRoundsPlayer2 = 0;
                            try {
                                System.out.println("enter number of games to win:");
                                settleWins = scanner.nextInt();
                                System.out.println("We are playing to: " + settleWins + " wins \nKeyboard controllers: \n[1] -> rock \n[2] -> paper \n[3] -> scissors \nLET THE GAME BEGIN!!!");
                            }
                            catch (InputMismatchException e) {
                                System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
                                return;
                            }
                        }
                        else if (userChoice == 'n') {
                            System.out.println("good bye" + name);
                            end = true;
                        }
                        else {
                            System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
                            end = true;
                        }
                    }
                    else {
                        System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
                        end = true;
                    }
                }
                else {
                    System.out.println("WRONG ARGUMENT, GAME IS TERMINATED");
                    end = true;
                }
            }
        }
    }

     */
}
