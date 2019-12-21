package com.huaxu.core.leetcode.topic700;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/25 20:57</p>
 * <p>author：huaxu</p>
 */
public class Topic739 {

    public static void main(String[] args) {
        int[] ints = new Solution().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
        //[1, 1, 4, 2, 1, 1, 0, 0]
    }

    static class Solution {
        public int[] dailyTemperatures(int[] T) {
            int[] res = Arrays.copyOf(T, T.length);
            for (int i = 0, length = T.length; i < length; i++) {
                int temp = T[i], j = i + 1;
                while (j < length && temp >= res[j]) {
                    j ++;
                }
                res[i] = j == length ? 0 : j - i;
            }
            return res;
        }
    }
}