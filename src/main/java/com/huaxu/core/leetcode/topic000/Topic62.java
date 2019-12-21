package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic62</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 16:38</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic62 {

    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] all = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0) {
                        all[i][j] = 1;
                    } else {
                        all[i][j] = all[i - 1][j] + all[i][j - 1];
                    }
                }
            }
            return all[m - 1][n - 1];
        }
    }
}