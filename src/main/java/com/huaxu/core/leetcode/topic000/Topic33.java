package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic33</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/16 19:59</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic33 {

    class Solution {
        public int search(int[] nums, int target) {
            int length = nums.length;
            if (length == 0) return -1;
            if (nums[0] > target) {
                for (int i = length-1; i > 0; i--) {
                    if (target == nums[i]) return i;
                }
            } else {
                for (int i = 0; i < length; i++) {
                    if (target == nums[i]) return i;
                }
            }
            return -1;
        }
    }
}