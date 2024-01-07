package com.java.interview;

import java.util.Arrays;

public class MoveNegativeNumberToLeft {
    public static void main(String[] args) {
        int[] input = {-1, 6, -4, 8, -9};

        moveNegativeNumbsToLeft(input);
        for (int i : input) {
            System.out.print(" " + i);
        }
    }

    private static void moveNegativeNumbsToLeft(int[] input) {

//        Arrays.sort(input);
        int counter =1;
        for (int i = 0; i < input.length; i++) {
            if (i > 0 && input[i] < 0) {
                int temp = input[counter];
                input[counter] =input[i];
                input[i] = temp;
                counter++;

            }
        }
    }
}
