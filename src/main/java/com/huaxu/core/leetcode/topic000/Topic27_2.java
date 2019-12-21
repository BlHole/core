package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/23 16:25</p>
 * <p>author：huaxu</p>
 */
public class Topic27_2 {

    class Solution {
        public int removeElement(int[] nums, int val) {
            int res = 0, length = nums.length;
            for (int i = 0; i < length; i ++) {
                if (nums[i] != val) {
                    nums[res] = nums[i];
                    res ++;
                }
            }
            return res;
        }
    }
}