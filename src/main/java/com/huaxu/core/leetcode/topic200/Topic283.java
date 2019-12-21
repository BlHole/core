package com.huaxu.core.leetcode.topic200;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/13 14:17</p>
 * <p>author：huaxu</p>
 */
public class Topic283 {

    public static void main(String[] args) {
        int[] ints = {10};
        new Solution().moveZeroes(ints);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length <= 1) {
                return;
            }
            int count = 0, length = nums.length - 1;
            for (int i = 0; i <= length; i++) {
                if (nums[i] == 0) {
                    count++;
                } else {
                    nums[i - count] = nums[i];
                }
            }
            while (count-- > 0) {
                nums[length - count] = 0;
            }
        }
    }
}