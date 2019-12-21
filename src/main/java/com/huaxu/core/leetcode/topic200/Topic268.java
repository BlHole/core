package com.huaxu.core.leetcode.topic200;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/23 17:24</p>
 * <p>author：huaxu</p>
 */
public class Topic268 {

    public static void main(String[] args) {
        new Solution().missingNumber(new int[]{});
    }


    static class Solution {
        public int missingNumber(int[] nums) {
            int res = nums.length;
            for(int i = 0; i < nums.length; i++){
                res += i - nums[i];
            }
            return res;
        }
    }
}