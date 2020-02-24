package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 16:15</p>
 * <p>author：huaxu</p>
 */
public class Topic47 {

    class Solution {
        public int maxValue(int[][] grid) {

            for (int i = 1; i < grid.length; i ++) {
                grid[i][0] = grid[i - 1][0] + grid[i][0];
            }

            for (int i = 1; i < grid[0].length; i ++) {
                grid[0][i] = grid[0][i - 1] + grid[0][i];
            }

            for (int i = 1; i < grid.length; i++) {
                for (int j = 1; j < grid[0].length; j++) {
                    grid[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
            return grid[grid.length - 1][grid[0].length - 1];
        }
    }
}