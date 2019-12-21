package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/23 16:04</p>
 * <p>author：huaxu</p>
 */
public class Topic27 {

    public static void main(String[] args) {
        new Solution().removeElement(new int[]{3, 2, 2, 3}, 3);
    }


    static class Solution {
        public int removeElement(int[] nums, int val) {
            int limit = 0, length = nums.length;
            for (int i = 0, j = 0; i < length - limit; i ++) {
                while (j < length && nums[j ++] == val) {
                    limit ++;
                }
                if (i + limit < length) {
                    nums[i] = nums[i + limit];
                }
            }
            return length - limit;
        }
    }
}