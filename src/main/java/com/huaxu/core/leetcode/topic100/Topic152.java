package com.huaxu.core.leetcode.topic100;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/10 10:00</p>
 * <p>author：huaxu</p>
 */
public class Topic152 {

    public static void main(String[] args) {
        System.out.println("123".split(",").length);
    }

    /**
     *  @Date: 10:00 AM 2019/10/10
     *  @Author: huaxu
     *  @Description:
     * 输入: [2,3,-2,4]
     * 输出: 6
     * 解释: 子数组 [2,3] 有最大乘积 6。
     *
     * 输入: [-2,0,-1]
     * 输出: 0
     * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
     */
    static class Solution {

        public int maxProduct(int[] nums) {
            int max = Integer.MIN_VALUE, imax = 1, imin = 1;
            for(int i=0; i<nums.length; i++){
                if(nums[i] < 0){
                    int tmp = imax;
                    imax = imin;
                    imin = tmp;
                }
                imax = Math.max(imax*nums[i], nums[i]);
                imin = Math.min(imin*nums[i], nums[i]);

                max = Math.max(max, imax);
            }
            return max;
        }
    }
}