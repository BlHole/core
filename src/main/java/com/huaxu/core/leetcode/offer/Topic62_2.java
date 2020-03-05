package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 22:15</p>
 * <p>author：huaxu</p>
 */
public class Topic62_2 {

    public static void main(String[] args) {
        new Topic62_2().new Solution().lastRemaining(5, 3);
    }


    class Solution {
        public int lastRemaining(int n, int m) {
            int last = 0;   //存活的最后一个人的位置
            for (int i = 2; i <= n; i++) {
                last = (last + m) % i;
            }
            return last;
        }
    }
}