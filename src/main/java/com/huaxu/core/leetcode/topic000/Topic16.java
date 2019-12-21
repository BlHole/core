package com.huaxu.core.leetcode.topic000;

import java.util.Arrays;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic16</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 12:54</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic16 {

    public static void main(String[] args) {
        int i = new Solution().threeSumClosest(new int[]{0,1,2}, 0);
        System.out.println(i);
    }

    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int sumMin = nums[0]+nums[1]+nums[2];
            int length = nums.length;
            for (int i = 0; i < length-2; i++) {
                int l = i+1, r = length-1;
                while (l < r) {
                    int sum = nums[i]+nums[l]+nums[r];
                    if (sum > target) {
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else{
                        return target;
                    }
                    if (Math.abs(sum-target) < Math.abs(sumMin-target)) {
                        sumMin = sum;
                    }
                }
            }
            return sumMin;
        }
    }
}