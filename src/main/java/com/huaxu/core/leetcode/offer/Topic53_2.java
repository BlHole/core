package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 17:53</p>
 * <p>author：huaxu</p>
 */
public class Topic53_2 {

    class Solution {
        public int missingNumber(int[] nums) {
            int low = 0, high = nums.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == mid) {
                    low = mid + 1;
                } else high = mid - 1;
            }
            return low;
        }
    }
}