package com.java.interview;

public class FindPeekElement {
    public static void main(String[] args) {
        int[] arr = {1,4,3,44,5,22,566,21,5,2};
        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
