package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/03 17:44</p>
 * <p>author：huaxu</p>
 */
public class Topic66 {

    /**
     *  给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
     *  其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
     *
     */
    class Solution {
        public int[] constructArr(int[] a) {
            if (a == null || a.length == 0) {
                return new int[]{};
            }
            int len = a.length;
            int[] res = new int[len];

            res[0] = 1;
            for (int i = 1; i < len; i++) {
                res[i] = res[i - 1] * a[i - 1];
            }
            int temp = 1;
            for (int i = len - 2; i >= 0; i--) {
                temp *= a[i + 1];
                res[i] *= temp;
            }
            return res;
        }
    }
}