package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningAnswer = "";

        if (handSign.equalsIgnoreCase("rock")) {
            winningAnswer = "paper";
        } else if (handSign.equalsIgnoreCase("paper")) {
            winningAnswer = "scissor";
        } else if (handSign.equalsIgnoreCase("scissor")) {
            winningAnswer = "rock";
        }

        return winningAnswer;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        String losingAnswer = "";

        if (handSign.equalsIgnoreCase("rock")) {
            losingAnswer = "scissor";
        } else if (handSign.equalsIgnoreCase("paper")) {
            losingAnswer = "rock";
        } else if (handSign.equalsIgnoreCase("scissor")) {
            losingAnswer = "paper";
        }

        return losingAnswer;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        String winner = "";

        if (handSignOfPlayer1.equalsIgnoreCase("rock") && handSignOfPlayer2.equalsIgnoreCase("paper")) {
            winner = "paper";
        } else if (handSignOfPlayer1.equalsIgnoreCase("paper") && handSignOfPlayer2.equalsIgnoreCase("scissor")) {
            winner = "scissor";
        } else if (handSignOfPlayer1.equalsIgnoreCase("scissors") && handSignOfPlayer2.equalsIgnoreCase("rock")) {
            winner = "rock";
        } else if (handSignOfPlayer2.equalsIgnoreCase("rock") && handSignOfPlayer1.equalsIgnoreCase("paper")) {
            winner = "paper";
        } else if(handSignOfPlayer2.equalsIgnoreCase("paper") && handSignOfPlayer1.equalsIgnoreCase("scissor")) {
            winner = "scissor";
        } else if(handSignOfPlayer2.equalsIgnoreCase("scissor") && handSignOfPlayer1.equalsIgnoreCase("rock")) {
            winner = "rock";
        }


        return winner;
    }
}
