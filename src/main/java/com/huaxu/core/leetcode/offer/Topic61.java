package com.huaxu.core.leetcode.offer;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 17:21</p>
 * <p>author：huaxu</p>
 */
public class Topic61 {

    class Solution {
        public boolean isStraight(int[] nums) {
            Arrays.sort(nums);
            int ant = 0, index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    ant ++;
                    continue;
                }
                index = i;
                break;
            }
            for (int i = index + 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) return false;
                if (nums[i] - nums[i - 1] == 1) {
                    continue;
                }
                ant -= nums[i] - nums[i - 1] - 1;
            }
            return ant >= 0;
        }
    }
}