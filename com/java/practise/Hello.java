package com.java.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        factorial(n);
        System.out.println(isPrime(n));
        System.out.println(Math.sqrt(n));

    }

    public static String isPrime(int n) {

        boolean isPrime = true;

        if (n == 0) {
            return "Not A Prime";
        } else if (n == 1) {
            return "Its a neither Prime or Composite";
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        if (isPrime)
            return "Its a Prime";
        else
            return "Not A Prime";

    }

    public static void factorial(int n) {

        int res = 1;

        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {

                res = res * i;

            }
            System.out.println(res);

        }

    }
}
