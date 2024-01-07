package com.java.practise;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayChunking {
    public static List<int[]> chunkArray(int[] array, int chunkSize) {
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("Chunk size should be greater than 0");
        }

        List<int[]> chunks = new ArrayList<>();

        for (int i = 0; i < array.length; i += chunkSize) {
            int end = Math.min(array.length, i + chunkSize);
            int[] chunk = Arrays.copyOfRange(array, i, end);
            chunks.add(chunk);
        }

        return chunks;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int chunkSize = 3;

        List<int[]> chunks = chunkArray(array, chunkSize);


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Akshay");
        hashMap.put(2, "AkshayI");
        hashMap.put(3, "AkshayVI");

        hashMap.forEach((key, value) -> System.out.println(key + " : " + value));
        List.of(array);
        List<Integer> list = Arrays.stream(array).filter(i -> i % 2 == 0).map(i -> i * 3).boxed().toList();
        list.forEach(System.out::println);
//        System.out.println("Original Array: " + Arrays.toString(array));
//
//        for (int i = 0; i < chunks.size(); i++) {
//            System.out.println("Chunk " + (i + 1) + ": " + Arrays.toString(chunks.get(i)));
//        }
    }


}
