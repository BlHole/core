package com.huaxu.core.leetcode.topic300;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/06 12:03</p>
 * <p>author：huaxu</p>
 */
public class Topic343 {

    public static void main(String[] args) {
        int i = new Solution().integerBreak(10);
        System.out.println(i);

    }

    static class Solution {
        public int integerBreak(int n) {
            if (n <= 3) return n-1;

            int a = n/3, b = n%3;
            if (b == 0) return pow(3, a);
            if (b == 1) return pow(3, a-1) << 2;
            return pow(3, a) << 1;
        }

        private int pow(int a, int b) {
            if (b == 0) return 1;
            return a * pow(a,  b-1);
        }
    }
}