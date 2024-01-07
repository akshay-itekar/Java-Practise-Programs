package com.java.interview;

public class HalfOrDouble {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8};

        System.out.println(halfOrDouble(arr));
        //   System.out.println(checkArray(arr));

    }

    private static boolean halfOrDouble(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            if ((arr[i + 1] == arr[i] + arr[i])) {
                flag = true;
            } else if (arr[i + 1] == arr[i] / 2) {
                flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    public static boolean checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] != 2 * arr[j] && arr[i] != arr[j] / 2.0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkHalfOrDouble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] * 2 == arr[j] || arr[i] == arr[j] * 2)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }


}
