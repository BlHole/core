package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/12 10:06</p>
 * <p>author：huaxu</p>
 */
public class Topic63 {

    public static void main(String[] args) {
        int[] a0 = new int[]{0,0};
        int[] a1 = new int[]{1,0};
        int a = new Topic63().new Solution().uniquePathsWithObstacles(new int[][]{a0, a1});
        System.out.println(a);
    }


    private class Solution {
        public int uniquePathsWithObstacles(int[][] dp) {
            if (dp[0][0] == 1 || dp[dp.length - 1][dp[0].length - 1] == 1) return 0;
            for (int i = 1; i < dp.length; i ++) {
                if (dp[i][0] == 1) {
                    dp[i][0] = -1;
                    continue;
                }
                if (dp[i - 1][0] == -1) {
                    dp[i][0] = -1;
                } else dp[i][0] = 1;
            }
            for (int i = 1; i < dp[0].length; i ++) {
                if (dp[0][i] == 1) {
                    dp[0][i] = -1;
                    continue;
                }
                if (dp[0][i - 1] == -1) {
                    dp[0][i] = -1;
                } else dp[0][i] = 1;
            }
            for (int i = 1; i < dp.length; i ++) {
                for (int j = 1; j < dp[0].length; j ++) {
                    if (dp[i][j] == 1) {
                        dp[i][j] = -1;
                    } else if (dp[i][j - 1] == -1 && dp[i - 1][j] == -1) {
                        dp[i][j] = -1;
                    } else if (dp[i][j - 1] == -1) {
                        dp[i][j] = dp[i - 1][j];
                    } else if (dp[i - 1][j] == -1) {
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    }
                }
            }
            int res = dp[dp.length - 1][dp[0].length - 1];
            if (res == 0) return 1;
            if (res == -1) return 0;
            return res;
        }
    }
}