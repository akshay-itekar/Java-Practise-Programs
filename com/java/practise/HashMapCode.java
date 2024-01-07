package com.java.practise;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> {
        private int size;
        private LinkedList<Node> buckets[];

        private class Node {

            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        public HashMap() {
            size = 0;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }


        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;

                }
                di++;

            }
            return -1;

        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % size;
        }
    }
}
