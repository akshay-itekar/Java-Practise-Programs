package com.java.interview;

public class FindIncreasingAndDecreasingElement {
    public static void main(String[] args) {

        int[] arr = {7,15,90,120,150, 100, 80, 20, 0};

        System.out.println(arr.length);
        System.out.println(findElement(arr));

    }

    public static int findElement(int arr[]) {

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid ;
            }
        }


        return arr[left];
    }
}
