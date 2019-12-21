package com.huaxu.core.leetcode.topic100;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/24 18:27</p>
 * <p>author：huaxu</p>
 */
public class Topic167_3 {

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int l = 0;
            int r = numbers.length-1;

            while(numbers[l]+numbers[r] != target){
                while(numbers[l] + numbers[r] > target) r --;
                while(numbers[l] + numbers[r] < target) l ++;
            }
            return new int[]{l+1,r+1};
        }
    }
}