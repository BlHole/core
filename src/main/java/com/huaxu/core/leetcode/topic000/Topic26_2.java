package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic26_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/16 22:57</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic26_2 {

    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
            int i = 0;
            for (int j = 0,length =  nums.length; j < length; j++) {
                if (nums[i] != nums[j]) {
                    nums[++i] = nums[j];
                }
            }
            return i+1;
        }
    }
}