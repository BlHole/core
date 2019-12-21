package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/23 17:17</p>
 * <p>author：huaxu</p>
 */
public class Topic66 {

     class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i --) {
                digits[i] ++;
                digits[i] = digits[i] % 10;
                if (digits[i] != 0) return digits;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }
}