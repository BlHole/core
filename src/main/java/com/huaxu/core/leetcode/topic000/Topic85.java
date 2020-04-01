package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/04/01 18:20</p>
 * <p>author：huaxu</p>
 */
public class Topic85 {

    class Solution {
        public int maximalRectangle(char[][] matrix) {

            if (matrix.length == 0) return 0;
            int maxarea = 0;
            int[][] dp = new int[matrix.length][matrix[0].length];

            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if (matrix[i][j] == '1'){
                        dp[i][j] = j == 0? 1 : dp[i][j-1] + 1;

                        int width = dp[i][j];

                        for(int k = i; k >= 0; k--){
                            width = Math.min(width, dp[k][j]);
                            maxarea = Math.max(maxarea, width * (i - k + 1));
                        }
                    }
                }
            } return maxarea;
        }
    }
}