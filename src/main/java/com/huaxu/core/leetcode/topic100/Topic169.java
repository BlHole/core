package com.huaxu.core.leetcode.topic100;

import java.util.Arrays;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic169</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 22:07</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic169 {

    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }
}