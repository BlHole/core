package com.huaxu.core.leetcode.topic200;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/22 11:19</p>
 * <p>author：huaxu</p>
 */
public class Topic200 {

    class Solution {
        public int numIslands(char[][] grid) {
            int islandNum = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        infect(grid, i, j);
                        islandNum ++;
                    }
                }
            }
            return islandNum;
        }

        public void infect(char[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length ||
                j < 0 || j >= grid[0].length ||
                    grid[i][j] != '1') {
                return;
            }
            grid[i][j] = '2';
            infect(grid, i + 1, j);
            infect(grid, i - 1, j);
            infect(grid, i, j + 1);
            infect(grid, i, j - 1);
        }
    }
}