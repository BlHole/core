package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/15 18:35</p>
 * <p>author：huaxu</p>
 */
public class Topic96 {

    class Solution {
        public int numTrees(int n) {
            int[] G = new int[n + 1];
            G[0] = 1;
            G[1] = 1;

            for (int i = 2; i <= n; ++i) {
                for (int j = 1; j <= i; ++j) {
                    G[i] += G[j - 1] * G[i - j];
                }
            }
            return G[n];
        }
    }
}