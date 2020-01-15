package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 10:30</p>
 * <p>author：huaxu</p>
 */
public class Topic52 {

    class Solution {

        private int res;
        private boolean[] cols;
        private boolean[] leftDown; // i + j
        private boolean[] rightDown; // i - j + n

        public int totalNQueens(int n) {
            cols = new boolean[n];
            leftDown = new boolean[n << 1];
            rightDown = new boolean[n << 1];
            solution(n, 0);
            return res;
        }

        private void solution(int n, int i) {
            if (n == i) res ++;
            for (int j = 0; j < n; j++) {
                if (!cols[j] && !leftDown[i + j] && !rightDown[i - j + n]) {
                    cols[j] = true;
                    leftDown[i + j] = true;
                    rightDown[i - j + n] = true;
                    solution(n, i + 1);
                    cols[j] = false;
                    leftDown[i + j] = false;
                    rightDown[i - j + n] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = new Topic52().new Solution().totalNQueens(8);
        System.out.println(n);
    }
}