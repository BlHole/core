package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 11:23</p>
 * <p>author：huaxu</p>
 */
public class Topic21 {

    class Solution {
        public int[] exchange(int[] nums) {
            int low = 0, high = nums.length - 1;
            while (low < high) {
                while(low < high && (nums[low] & 1 ) == 1) {
                    low ++;
                }
                while(low < high && (nums[high] & 1 ) == 0) {
                    high --;
                }
                if (low < high) {
                    int temp = nums[low];
                    nums[low] = nums[high];
                    nums[high] = temp;
                }
            }
            return nums;
        }
    }
}