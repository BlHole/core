package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 20:18</p>
 * <p>author：huaxu</p>
 */
public class Topic14_1 {

    class Solution {
        public int cuttingRope(int n) {
            if(n <= 3) {
                return n - 1;
            }
            int r = n % 3;
            long ref = 1l;

            for(int i = 0; i < n / 3 - 1; i++) {
                ref = (ref * 3) % 1000000007;
            }

            if(r == 0) {
                ref = (ref * 3) % 1000000007;
            } else if(r == 1) {
                ref =  (ref * 4) % 1000000007;
            } else if(r == 2) {
                ref = (ref * 6) % 1000000007;
            }
            return (int)ref;
        }
    }
}