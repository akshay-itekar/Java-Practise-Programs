package com.java.interview;

import java.util.HashMap;
import java.util.Map;

class Player {
    String name;
    int position;

    Player(String name) {
        this.name = name;
        this.position = 0;
    }
}

class Game {
    Map<Integer, Integer> snakes = new HashMap<>();
    Map<Integer, Integer> ladders = new HashMap<>();
    Player[] players;
    int[] diceRolls;
    int currentRoll = 0;

    Game(String player1, String player2, int[] diceRolls) {
        players = new Player[]{new Player(player1), new Player(player2)};
        this.diceRolls = diceRolls;
        snakes.put(99, 9);
        snakes.put(30, 3);
        ladders.put(5, 25);
        ladders.put(13, 95);
    }

    void play() {
        for (Player player : players) {
            while (player.position < 100 && currentRoll < diceRolls.length ) {

                int roll = diceRolls[currentRoll++];

                int newPosition = player.position + roll;
                if (newPosition > 100) {
                    System.out.println(player.name + " rolled a " + roll + " and stayed at " + player.position);
                    continue;
                }
                if (snakes.containsKey(newPosition)) {
                    System.out.println(player.name + " rolled a " + roll + " and hit a snake! Slid down from " + newPosition + " to " + snakes.get(newPosition));
                    newPosition = snakes.get(newPosition);
                } else if (ladders.containsKey(newPosition)) {
                    System.out.println(player.name + " rolled a " + roll + " and hit a ladder! Climbed up from " + newPosition + " to " + ladders.get(newPosition));
                    newPosition = ladders.get(newPosition);
                } else {
                    System.out.println(player.name + " rolled a " + roll + " and moved from " + player.position + " to " + newPosition);
                }
                player.position = newPosition;
                if (player.position == 100) {
                    System.out.println(player.name + " wins!");
                    break;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] diceRolls = {5, 5, 5, 5, 5, 6};
        Game game = new Game("Player1", "Player2", diceRolls);
        game.play();
    }
}
