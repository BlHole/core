package com.huaxu.core.leetcode.topic100;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic169_3</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 22:23</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic169_3 {

    class Solution {
        public int majorityElement(int[] nums) {
            int res = nums[0], count = 0;
            for (int i = 1; i < nums.length; i ++) {
                if (res == nums[i]) {
                    count ++;
                } else if (count == 0){
                    res = nums[i];
                } else {
                    count --;
                }
            }
            return res;
        }
    }
}