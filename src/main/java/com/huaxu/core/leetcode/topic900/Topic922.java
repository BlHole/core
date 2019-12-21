package com.huaxu.core.leetcode.topic900;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/25 17:43</p>
 * <p>author：huaxu</p>
 */
public class Topic922 {

    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            for (int i = 0, j = 1, length = A.length; i < length; i += 2) {
                if ((A[i] & 1) != 0) {
                    while ((A[j] & 1) != 0)  j += 2;

                    // Swap A[i] and A[j]
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
            return A;
        }
    }
}