package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 17:29</p>
 * <p>author：huaxu</p>
 */
public class Topic39 {

    class Solution {
        public int majorityElement(int[] nums) {
            int target = nums[0], num = 0;
            for (int i = 1; i < nums.length; i ++) {
                if (nums[i] == target) {
                    num ++;
                } else {
                    if (num == 0) {
                        target = nums[i];
                    } else {
                        num --;
                    }
                }
            }
            return target;
        }
    }
}