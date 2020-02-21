package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 11:56</p>
 * <p>author：huaxu</p>
 */
public class Topic04 {

    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix.length == 0 || matrix[0].length == 0) return false;
            int i = 0, j = 0;
            for (; i < matrix.length; i++) {
                if (matrix[i][0] > target) {
                    break;
                }
            }
            for (; j < matrix[0].length; j++) {
                for (int k = 0; k < i; k++) {
                    if (matrix[k][j] == target) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}