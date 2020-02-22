package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 10:54</p>
 * <p>author：huaxu</p>
 */
public class Topic16 {



    class Solution {
        public double myPow(double x, int n) {
            double res = helper(x, Math.abs(n/2)) * helper(x, Math.abs( n - n/2));
            return n > 0 ? res : 1 / res;
        }

        private double helper(double x, int n) {
            if (n == 0) return 1;
            if (n == 1) return x;

            double res = helper(x , n / 2);
            return n % 2 == 1 ? res * res * x : res * res;
        }
    }
}