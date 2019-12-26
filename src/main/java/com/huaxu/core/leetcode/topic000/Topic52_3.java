package com.huaxu.core.leetcode.topic000;

import org.springframework.data.redis.listener.Topic;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 11:03</p>
 * <p>author：huaxu</p>
 */
public class Topic52_3 {

    class Solution {
        private boolean[] cols;
        private boolean[] leftDowns; // i + j
        private boolean[] rightDowns;// i - j

        public int totalNQueens(int n) {
            cols = new boolean[n];
            leftDowns = new boolean[n << 1];
            rightDowns = new boolean[n << 1];
            return doFillTable(n, 0);
        }

        private int doFillTable(int n, int i) {
            int res = 0;
            if (n == i) return 1;
            for (int j = 0; j < n; j ++) {
                // to avoid negative Numbers you need to add n
                if (!cols[j] && !leftDowns[i + j] && !rightDowns[i - j + n]) {
                    cols[j] = true;
                    leftDowns[i + j] = true;
                    rightDowns[i - j + n] = true;
                    res += doFillTable(n, i + 1);

                    cols[j] = false;
                    leftDowns[i + j] = false;
                    rightDowns[i - j + n] = false;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int i = new Topic52_3().new Solution().totalNQueens(4);
        System.out.println(i);
    }
}