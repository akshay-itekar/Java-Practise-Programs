package com.java.practise;

import java.util.ArrayList;
import java.util.Collections;

class Card implements Comparable<Card> {
    private String suit;
    private String rank;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public int compareTo(Card other) {
        // Compare first by suit, then by rank
        int suitComparison = this.suit.compareTo(other.suit);
        if (suitComparison == 0) {
            return this.rank.compareTo(other.rank);
        }
        return suitComparison;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

public class DeckOfCards {
    public static void main(String[] args) {
        // Create a deck of cards
        ArrayList<Card> deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
        for (Card card : deck) {
            System.out.println(card);
        }
        // Shuffle the deck (optional)
        Collections.shuffle(deck);

        // Sort the deck
        Collections.sort(deck);
        System.out.println("Ouptput");
        // Display the sorted deck
        for (Card card : deck) {
            System.out.println(card);
        }

        System.out.println(deck.get(9) + " " +deck.get(12 ));
        System.out.println(compare(deck.get(9),deck.get(12)));
    }

    public static Card compare(Card c1, Card c2) {

        return c1.getRank().compareTo(c2.getRank()) > 0 ? c1 : c2;

    }
}
