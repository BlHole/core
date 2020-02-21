package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 16:18</p>
 * <p>author：huaxu</p>
 */
public class Topic11 {

    class Solution {
        public int minArray(int[] numbers) {
            int i = 0, j = numbers.length - 1;
            while (i < j) {
                int m = (i + j) / 2;
                if (numbers[m] > numbers[j]) i = m + 1;
                else if (numbers[m] < numbers[j]) j = m;
                else j--;
            }
            return numbers[i];
        }
    }
}