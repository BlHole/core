package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic7_2</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 17:00</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic7_2 {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-123456));
    }

    static class Solution {
        public int reverse(int x) {
            long result = 0;
            while (x!=0) {
                result = result*10 + x%10;
                x /= 10;
            }

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
            return (int)result;
        }
    }
}