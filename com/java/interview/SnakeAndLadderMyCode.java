package com.java.interview;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.exit;

public class SnakeAndLadderMyCode {
    String[] players = {"Player1", "Player2"};

    Map<Integer, Integer> ladders = new HashMap<>();
    Map<Integer, Integer> snakes = new HashMap<>();

    Map<String, Integer> playerPosition = new HashMap<>();

    public int getDiceRoll() {
        return 5;
    }

    public SnakeAndLadderMyCode() {
        for (String s : players) {
            playerPosition.put(s, 0);
        }
        ladders.put(5, 25);
        ladders.put(13, 95);
        snakes.put(99, 9);
        snakes.put(30, 3);
    }

    public static void main(String[] args) {
        SnakeAndLadderMyCode snakeAndLadderMyCode = new SnakeAndLadderMyCode();
        snakeAndLadderMyCode.playGame();
    }

    private void playGame() {
        for (int i = 1; i <= 5; i++) {

            for (String players : players) {
                int diceRoll = getDiceRoll();
                if (i == 5) diceRoll = 6;
                System.out.println(players + " rolls the dice and gets " + diceRoll);
                movePlayer(players, diceRoll);


            }
        }
    }

    private void movePlayer(String player, int diceRoll) {

        int currentPosition = playerPosition.get(player);
        int newPostition = currentPosition + diceRoll;

        if (ladders.containsKey(newPostition)) {
            System.out.println(player + " Has moved to position " + ladders.get(newPostition));
            newPostition = ladders.get(newPostition);
        } else if (snakes.containsKey(newPostition)) {
            System.out.println(player + " Has moved to position " + snakes.get(newPostition));
            newPostition = snakes.get(newPostition);
        }

        if (newPostition == 100) {
            System.out.println(player + " Has Won!!!");
            exit(567);
        }

        playerPosition.put(player, newPostition);

    }

}


