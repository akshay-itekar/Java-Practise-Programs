package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class SnakeAndLadderGame {
    private String[] players = {"Player1", "Player2"};
    private Map<String, Integer> playerPositions = new HashMap<>();
    private Map<Integer, Integer> snakes = new HashMap<>();
    private Map<Integer, Integer> ladders = new HashMap<>();

    public SnakeAndLadderGame() {
        for (String player : players) {
            playerPositions.put(player, 0);
        }

        snakes.put(99, 9);
        snakes.put(30, 3);

        ladders.put(5, 25);
        ladders.put(13, 95);
    }

    public int rollDice() {
        return 5; // Hard-coded to always return 5
    }

    public void movePlayer(String player, int steps) {
        int currentPosition = playerPositions.get(player);
        int newPosition = currentPosition + steps;

        // Check for snakes
        if (snakes.containsKey(newPosition)) {
            newPosition = snakes.get(newPosition);
            System.out.println(player + " encountered a snake! " + currentPosition + " => " + newPosition);
        }

        // Check for ladders
        else if (ladders.containsKey(newPosition)) {
            newPosition = ladders.get(newPosition);
            System.out.println(player + " found a ladder! " + currentPosition + " => " + newPosition);
        }

        playerPositions.put(player, newPosition);
    }

    public void playGame() {
        for (int round = 1; round <= 5; round++) { // Play for 5 rounds (as specified)
            for (String player : players) {
                int diceRoll = rollDice();
                System.out.println(player + " rolls the dice and gets " + diceRoll);
                movePlayer(player, diceRoll);

                if (playerPositions.get(player) >= 100) {
                    System.out.println(player + " wins!");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        SnakeAndLadderGame game = new SnakeAndLadderGame();
        game.playGame();
    }
}
