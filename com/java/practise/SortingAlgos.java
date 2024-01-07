package com.java.practise;

import java.util.Arrays;
import java.util.List;

public class SortingAlgos {
    public static void main(String[] args) {
        
        
        int[] a = {5,3,1,2,4};
        
        //bubbleSort(a);
       // selectionSort(a);
        insertionSort(a);

    }

    private static void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int prev = i-1;

            while(prev >= 0 && a[prev] > curr){

                a[prev+1]= a[prev];
                prev --;

            }

            a[prev+1] = curr;
        }

        for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
        }
    }

    private static void selectionSort(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < a.length-1; j++) {

                if(a[minPos] > a[j]){
                    minPos = j;
                }
            }

            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length-1; i++) {
                for (int j = 0; j < a.length-1-i; j++) {
                    {
                        if(a[j] < a[j+1]){
                            int temp = a[j];
                            a[j]=a[j+1];
                            a[j+1]=temp;
                        }
                    }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
