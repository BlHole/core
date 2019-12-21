package com.huaxu.core.leetcode.topic100;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_136_2</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/28 14:59</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic136_2 {

    public static void main(String[] args) {
        new Solution().singleNumber(new int[]{8,8,2,4,4});
    }

    static class Solution {
        public int singleNumber(int[] nums) {
            int bitNum = 0;
            for (int num : nums) {
                bitNum ^= num;
            }
            return bitNum;
        }
    }
}