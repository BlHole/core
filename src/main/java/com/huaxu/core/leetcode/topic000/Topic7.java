package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic1</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 09:38</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic7 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int reverse = solution.reverse(-2147483648);
        System.out.println(reverse);
    }

    static class Solution {
        public int reverse(int x) {
            long sum = 0;
            int length = String.valueOf(x).length();
            length =  x < 0 ? length-1 : length;

            while (x != 0) {
                long temp = x%10 ;
                sum += temp*pow(--length);
                if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
                    return 0;
                x = x/10;
            }
            return (int)sum;
        }

        public int pow(int x) {
            int result = 1;

            while(x-- > 0)
                result *= 10;
            return result;
        }
    }
}