package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 10:48</p>
 * <p>author：huaxu</p>
 */
public class Topic52_2 {

    class Solution {
        public boolean is_not_under_attack(int row, int col, int n,
                                           int [] rows,
                                           int [] hills,
                                           int [] dales) {
            int res = rows[col] + hills[row - col + 2 * n] + dales[row + col];
            return (res == 0) ? true : false;
        }

        public int backtrack(int row, int count, int n,
                             int [] rows,
                             int [] hills,
                             int [] dales) {

            for (int col = 0; col < n; col++) {
                if (is_not_under_attack(row, col, n, rows, hills, dales)) {
                    rows[col] = 1;
                    hills[row - col + 2 * n] = 1;
                    dales[row + col] = 1;

                    if (row + 1 == n) count++;
                    else count = backtrack(row + 1, count, n,
                            rows, hills, dales);

                    rows[col] = 0;
                    hills[row - col + 2 * n] = 0;
                    dales[row + col] = 0;
                }
            }
            return count;
        }

        public int totalNQueens(int n) {
            int rows[] = new int[n];
            int hills[] = new int[4 * n - 1];
            int dales[] = new int[2 * n - 1];
            return backtrack(0, 0, n, rows, hills, dales);
        }
    }
}