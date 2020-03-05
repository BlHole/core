package com.huaxu.core.leetcode.offer;

import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 21:29</p>
 * <p>author：huaxu</p>
 */
public class Topic62 {

    public static void main(String[] args) {
        System.out.println(new Topic62().new Solution().lastRemaining(708, 122));
    }

    class Solution {

        public int lastRemaining(int n, int m) {
            LinkedList<Integer> queue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                queue.addLast(i);
            }
            while (queue.size() != 1) {
                for (int i = 0; i < m; i++) {
                    Integer pre = queue.pollFirst();
                    if (i != m - 1) {
                        queue.addLast(pre);
                    }
                }
            }
            return queue.pollFirst();
        }

    }
}