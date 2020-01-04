package com.huaxu.core.leetcode.type.traceBack;

/**
 * <p>project: core</p>
 * <p>description: https://leetcode-cn.com/problems/n-queens-ii/</p>
 * <p>create: 2020/01/04 10:59</p>
 * <p>author：huaxu</p>
 */
public class TraceBackN {

    private boolean[] cols;
    private boolean[] leftDowns; // i + j
    private boolean[] rightDowns;// i - j + n

    /**
     *  @Date: 11:14 AM 2020/1/4
     *  @Author: huaxu
     *  @Description:
     *
     *  [".Q..",
     *   "...Q",
     *   "Q...",
     *   "..Q."]
     */
    public int totalNQueens(int n) {
        cols = new boolean[n];
        leftDowns = new boolean[n << 1];
        rightDowns = new boolean[n << 1];
        return doFillTable(n, 0);
    }

    private int doFillTable(int limit, int i) {
        int res = 0;
        if (limit == i) return 1;
        for (int j = 0; j < limit; j ++) {
            if (!cols[j] && !leftDowns[i + j] && !rightDowns[i - j + limit]) {
                cols[j] = true;
                leftDowns[i + j] = true;
                rightDowns[i - j + limit] = true;
                res += doFillTable(limit, i + 1);
                // traceBack
                cols[j] = false;
                leftDowns[i + j] = false;
                rightDowns[i - j + limit] = false;
            }
        }
        return res;
    }
}