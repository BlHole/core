package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_8</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 17:18</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic9 {


    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            int sum = 0;
            int original = x;
            while (x!=0) {
                int temp = x%10;
                x /=10;
                sum = sum*10 + temp;
            }
            return sum == original ? true : false;
        }
    }
}