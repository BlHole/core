package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic53</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/02 20:30</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic53 {

    public static void main(String[] args) {
        new Topic53().new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    // -2,1,-3,4,-1,2,1,-5,4
    class Solution {
        public int maxSubArray(int[] nums) {
            int sum = 0;
            int res = nums[0];
            for (int num : nums) {
                if (sum > 0)
                    sum += num;
                else
                    sum = num;
                res = Math.max(res, sum);
            }
            return res;
        }
    }
}