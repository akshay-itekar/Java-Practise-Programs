package com.java.interview;

public class CheckIfDoubleExits {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 11};

        System.out.println(checkIfExists(arr));
    }

    private static boolean checkIfExists(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }

            }
        }
        return false;
    }
}
