package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 10:30</p>
 * <p>author：huaxu</p>
 */
public class Topic52 {

    class Solution {

        /**
         * 记录某列是否已有皇后摆放
         */
        private boolean col[];

        /**
         * 记录某条正对角线（左上右下）是否已有皇后摆放（某条对角线对应的摆放位置为 x - y + n - 1）
         */
        private boolean dia1[];

        /**
         * 记录某条斜对角线（左下右上）是否已有皇后摆放（某条对角线对应的摆放位置为 x + y）
         */
        private boolean dia2[];

        public int totalNQueens(int n) {
            col = new boolean[n];
            dia1 = new boolean[2 * n - 1];
            dia2 = new boolean[2 * n - 1];
            return putQueen(n, 0);
        }

        /**
         * 递归回溯方式摆放皇后
         *
         * @param n     待摆放皇后个数
         * @param index 已摆放皇后个数
         */
        private int putQueen(int n, int index) {
            int res = 0;
            if (index == n) {
                return 1;
            }
            // 表示在 index 行的第 i 列尝试摆放皇后
            for (int i = 0; i < n; i++) {
                if (!col[i] && !dia1[i - index + n - 1] && !dia2[i + index]) {
                    // 递归
                    col[i] = true;
                    dia1[i - index + n - 1] = true;
                    dia2[i + index] = true;
                    res += putQueen(n, index + 1);
                    // 回溯
                    col[i] = false;
                    dia1[i - index + n - 1] = false;
                    dia2[i + index] = false;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int n = new Topic52().new Solution().totalNQueens(8);
        System.out.println(n);
    }
}