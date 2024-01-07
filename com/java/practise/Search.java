package com.java.practise;

import java.util.Arrays;
import java.util.Collections;

public class Search {
    public static void main(String[] args) {
        int[] a = {5, 2, 3, 21, 6, 8, 1, 65,};
//        int[] b = new int[a.length];
//        b = Arrays.stream(a).sorted().toArray();
//        Arrays.stream(b).forEach(System.out::println);

//        System.out.println(binarySearch(a, 2));
//
//        reverse(a);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }

        //bubbleSort(a);
        //selectionSort(a);
        Arrays.sort(a);
        System.out.println(bS(a, 8));
        System.out.println(Arrays.toString(a));

        int[][] matrix = new int[3][3];


    }

    private static void insertionSort(int[] a) {


    }

    private static void selectionSort(int[] a) {
        int n = a.length - 1;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j <= n; j++) {

                if (a[min] > a[j]) {
                    min = j;
                }

            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    private static void bubbleSort(int[] a) {

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i; j <= a.length - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
    }

    private static void reverse(int[] a) {
        int first = 0;
        int n = a.length - 1;
        while (first < n) {

            int temp = a[first];
            a[first] = a[n];
            a[n] = temp;
            first++;
            n--;
        }
    }

    private static String binarySearch(int[] b, int key) {
        int start = 0, end = b.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (b[mid] == key) {
                return "Found";
            }
            if (b[mid] < key) {
                start = mid + 1;
            }
            if (b[mid] > key) {
                end = mid - 1;
            }

        }
        return "Not Found";
    }

    public static int bS(int a[], int k) {

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (a[mid] == k) {
                return mid;
            } else if (k < a[mid]) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }


        }
        return -1;
    }
}
