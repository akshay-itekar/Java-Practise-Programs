package com.java.practise;

public class ArraysPractice {
    public static void main(String[] args) {
        int a[] = {1,53,6,2,8,5,55,58};

        largest(a);
    }

    private static void largest(int[] a) {
        int res =Integer.MIN_VALUE;
        int res1 = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {

            if(a[i]>res){
                res = a[i];
            }

            if(a[i]<res1){
                res1 = a[i];
            }
        }
        System.out.println(res);
        System.out.println(res1);
    }
}
