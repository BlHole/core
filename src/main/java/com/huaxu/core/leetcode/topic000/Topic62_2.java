package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic62_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 16:49</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic62_2 {

    public static void main(String[] args) {
        Solution solution = new Topic62_2().new Solution();
        System.out.println(solution.uniquePaths(3,2));
        System.out.println(solution.uniquePaths(7,3));
    }

    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m+1][n+1];
            for (int i = 1; i <= m; i++) {
                dp[i][1] = 1;
            }
            for (int i = 1; i <= n; i++) {
                dp[1][i] = 1;
            }
            for (int i =2; i <= m; i++) {
                for (int j =2; j <= n; j++) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            return dp[m][n];
        }
    }
}