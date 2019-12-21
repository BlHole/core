package com.huaxu.core.leetcode.topic200;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic231</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 19:46</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic231 {

    public static void main(String[] args) {
        boolean powerOfTwo = new Solution().isPowerOfTwo(0);
        System.out.println(powerOfTwo);
    }

    static class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            String bit = Long.toBinaryString(n);
            if (bit.charAt(0) != '1') return false;
            for (int i = 1,length = bit.length(); i < length; i++) {
                if (bit.charAt(i) != '0') {
                    return false;
                }
            }
            return true;
        }
    }
}