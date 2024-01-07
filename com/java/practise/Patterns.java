package com.java.practise;

import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {

        hallowRectangle(6, 5);

        int a[] = {97, 98, 99, 94, 95};


        Arrays.stream(a).forEach(System.out::println);
        updateArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void updateArray(int a[]) {

        for (int i = 0; i < a.length; i++) {

            a[i] = a[i] + 1;

        }
    }

    public static void hallowRectangle(int n, int m) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();

        }


    }


}
