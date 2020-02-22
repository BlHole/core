package com.huaxu.core.leetcode.offer;

import java.util.PriorityQueue;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 17:30</p>
 * <p>author：huaxu</p>
 */
public class Topic40 {

    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            if (k == 0) return new int[]{};
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
            for (int i : arr) {
                minHeap.add(i);
            }

            int[] res = new int[k];
            while (k > 0) {
                res[-- k] = minHeap.poll();
            }
            return res;
        }
    }
}