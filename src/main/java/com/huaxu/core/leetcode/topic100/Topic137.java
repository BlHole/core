package com.huaxu.core.leetcode.topic100;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_137</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/29 21:51</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic137 {

    static class Solution {
        public int singleNumber(int[] nums) {
            int one = 0, two = 0, three;
            for (int num : nums) {
                // two的相应的位等于1，表示该位出现2次
                two |= (one & num);
                // one的相应的位等于1，表示该位出现1次
                one ^= num;
                // three的相应的位等于1，表示该位出现3次
                three = (one & two);
                // 如果相应的位出现3次，则该位重置为0
                two &= ~three;
                one &= ~three;
            }
            return one;
        }
    }
}