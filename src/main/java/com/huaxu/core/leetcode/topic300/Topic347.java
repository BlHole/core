package com.huaxu.core.leetcode.topic300;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/26 14:26</p>
 * <p>author：huaxu</p>
 */
public class Topic347 {


    public static void main(String[] args) {
        List<Integer> list = new Solution().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        list.forEach(entry -> System.out.println(entry));
    }

    static class Solution {
        public List<Integer> topKFrequent(int[] nums, int k) {
            // build hash map : character and how often it appears
            HashMap<Integer, Integer> count = new HashMap();
            for (int n: nums) {
                count.put(n, count.getOrDefault(n, 0) + 1);
            }

            // init heap 'the less frequent element first'
            PriorityQueue<Integer> heap =
                    new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));

            // keep k top frequent elements in the heap
            for (int n: count.keySet()) {
                heap.add(n);
                if (heap.size() > k)
                    heap.poll();
            }

            // build output list
            List<Integer> top_k = new LinkedList();
            while (!heap.isEmpty())
                top_k.add(heap.poll());
            Collections.reverse(top_k);
            return top_k;
        }
    }
}