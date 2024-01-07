package com.java.practise;

public class LongestEvenWord {

    public static int getLongestEvenWordLength(String input) {

        int longestEvenWordLength = 0;

        String[] words = input.split("\\s+");

        for (String word : words) {

            if (word.length() % 2 == 0 && word.length() > longestEvenWordLength) {

                longestEvenWordLength = word.length();

            }

        }

        return longestEvenWordLength;

    }

    public static void main(String[] args) {

        String input = "The quick brown fox jumps over the lazy dog";

        int longestEvenWordLength = getLongestEvenWordLength(input);

        if (longestEvenWordLength == 0) {

            System.out.println("There are no even-length words in the input string.");

        } else {

            System.out.println("The length of the longest even-length word in the input string is: " + longestEvenWordLength);

        }

    }

}