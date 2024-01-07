package com.java.practise;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class StringsPratice {
    public static void main(String[] args) {

        String str = "aaabbbcccc";
        //  voweL(str);
        compressString(str);
        System.out.println(checkPalindrome(str));

        String flag = "N";

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(2, 3);


        if (!"Y".equals(flag) && Objects.nonNull(flag)) {
            System.out.println("true");
        }

    }

    private static void compressString(String str) {

    }

    private static boolean checkPalindrome(String str) {

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {

            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static void voweL(String str) {
        for (int i = 0; i < str.length(); i++) {

            if (checkVowel(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }
    }

    private static boolean checkVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }


        return false;
    }

}
