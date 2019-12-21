package com.huaxu.core.leetcode.topic200;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic238</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/28 15:53</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic238 {

    public static void main(String[] args) {
        new Topic238().new Solution().productExceptSelf(new int[]{1,2,3,4});
    }

    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];
            for (int i = 0, length = nums.length; i < length; i++) {
                result[i] = numsMaxFilterIndex(i, length, nums);
            }
            return result;
        }

        private int numsMaxFilterIndex(int index, int length, int[] nums) {
            int temp = 1;
            for (int j = 0; j < length; j++) {
                if (index == j) continue;
                temp *= nums[j];
            }
            return temp;
        }
    }
}