package com.huaxu.core.leetcode.topic200;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic238_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/28 16:22</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic238_2 {

    public static void main(String[] args) {
        new Topic238_2().new Solution().productExceptSelf(new int[]{1,2,3,4});
    }

    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int len = nums.length;
            int[] output = new int[len];
            for(int i = 0, left = 1; i < len; i++){
                output[i] = left;
                left *= nums[i];
            }
            for(int j = len - 1, right = 1; j >= 0; j--){
                output[j] *= right;
                right *= nums[j];
            }
            return output;
        }
    }
}