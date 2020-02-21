package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 19:31</p>
 * <p>author：huaxu</p>
 */
public class Topic13 {

    class Solution {
        int sum = 0;
        public int movingCount(int m, int n, int k) {
            if (k == 0) return 1;
            bfs(0, 0, m, n, k, new int[m][n]);
            return sum;
        }

        private void bfs(int i, int j, int m, int n, int k, int[][] arr) {
            if (i < 0 || j < 0 || i >= m || j >= n || arr[i][j] == 1 || !check(i, j, k)) return;
            arr[i][j] = 1;
            sum ++;
            bfs(i - 1, j, m, n, k, arr);
            bfs(i + 1, j, m, n, k, arr);
            bfs(i, j - 1, m, n, k, arr);
            bfs(i, j + 1, m, n, k, arr);
        }

        private boolean check(int a, int b, int k) {
            int sum = 0;
            while (a != 0) {
                sum += a % 10;
                a = a / 10;
            }
            while (b != 0) {
                sum += b % 10;
                b = b / 10;
            }
            return sum <= k;
        }
    }
}