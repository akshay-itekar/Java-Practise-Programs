package com.java.interview;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {
        String input;

        Scanner scn = new Scanner(System.in);
        input = scn.nextLine();

        System.out.println(checkIfValidBrackets(input));
    }

    private static boolean checkIfValidBrackets(String input) {
        char[] ch = input.toCharArray();

        if (input.isEmpty() || input.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                stack.push(')');
            } else if (ch[i] == '{') {
                stack.push('}');
            } else if (ch[i] == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || ch[i] != stack.pop()) {
                return false;
            }

        }
        return stack.isEmpty();
    }

}
