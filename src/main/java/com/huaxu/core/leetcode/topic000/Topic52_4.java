package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 14:08</p>
 * <p>author：huaxu</p>
 */
public class Topic52_4 {

    class Solution {
        int count = 0;

        public int totalNQueens(int n) {
            dfs(0, 0, 0, 0, n);  // 从0开始遍历就行了，dfs会自动遍历所有可能方案
            return count;
        }

        private void dfs(int row, int qCol, int larger, int smaller, int n) {
            if (row >= n) count++;

            int bits = (~(qCol | larger | smaller)) & ((1 << n) - 1);
            while (bits != 0) {
                int tryBit = bits & -bits;  // 获取最低位,尝试遍历，失败则回溯
                dfs(row + 1, qCol | tryBit,(larger | tryBit) << 1,(smaller | tryBit) >> 1, n);
                bits &= bits - 1; // 删除最低位,尝试下一个候选cur
            }
        }
    }
}