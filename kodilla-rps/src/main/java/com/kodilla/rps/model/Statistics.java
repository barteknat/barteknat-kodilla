package com.kodilla.rps.model;

public final class Statistics {

    private int rounds;
    private int wins;
    private int loses;
    private int draws;

    public int getRounds() {
        return rounds;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public void incrementRounds() {
        this.rounds++;
    }

    public void incrementWins() {
        this.wins++;
    }

    public void incrementLoses() {
        this.loses++;
    }

    public void incrementDraws() {
        this.draws++;
    }

    public void resetStatistics() {
        this.rounds = 0;
        this.wins = 0;
        this.loses = 0;
        this.draws = 0;
    }

    @Override
    public String toString() {
        return "played rounds = " + rounds +
                "\nplayer wins   = " + wins +
                "\nenemy wins    = " + loses +
                "\ndraws         = " + draws;
    }

    public Winner whoWins() {
        if (wins > loses) return Winner.PLAYER;
        if (wins < loses) return Winner.ENEMY;
        return Winner.NOBODY;
    }

    public boolean hasNextRound(int roundsCount) {
        return getWins() < roundsCount && getLoses() < roundsCount;
    }
}

