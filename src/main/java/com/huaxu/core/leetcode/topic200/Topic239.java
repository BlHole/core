package com.huaxu.core.leetcode.topic200;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 11:03</p>
 * <p>author：huaxu</p>
 */
public class Topic239 {

    public static void main(String[] args) {

        int[] ints = new Topic239().new Solution().maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(ints));
    }

    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || nums.length == 0) return new int[]{};
            int[] res = new int[nums.length - k + 1];
            int index = 0;
            LinkedList<Integer> queue = new LinkedList();
            for (int i = 0; i < k - 1; i ++) {
                queue.add(nums[i]);
            }
            for (int i = k - 1; i < nums.length; i ++) {
                queue.addLast(nums[i]);
                res[index ++] = getMaxData(queue);
                queue.removeFirst();
            }
            return res;
        }

        private int getMaxData(LinkedList<Integer> queue) {
            Integer max = queue.peek();
            for (Integer integer : queue) {
                max = Math.max(integer, max);
            }
            return max;
        }
    }
}