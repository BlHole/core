package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic70_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 21:52</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic70_2 {

    class Solution {
        public int climbStairs(int n) {
            if (n == 1) return 1;

            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
    }
}