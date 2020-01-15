package com.huaxu.core.leetcode.topic000;

import org.springframework.data.redis.listener.Topic;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 14:11</p>
 * <p>author：huaxu</p>
 */
public class Topic91 {

    public static void main(String[] args) {
        int i = new Topic91().new Solution().numDecodings("17");
        System.out.println(i);
    }

    /**
     *
     *  一条包含字母 A-Z 的消息通过以下方式进行了编码：
     * 'A' -> 1
     * 'B' -> 2
     * ...
     * 'Z' -> 26
     * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
     */

    class Solution {
        public int numDecodings(String s) {
            if (s.length() == 0 || s.charAt(0) == '0') return 0;
            char[] chars = s.toCharArray();
            return encode(chars, chars.length);
        }

        private int encode(char[] chars, int length) {

            if (length <= 1) return 1;
            char prev = chars[length - 2];
            char curr = chars[length - 1];

            int count = 0;
            if (curr != '0') {
                count = encode(chars, length - 1);
            }
            if (prev == '1' || (prev == '2' && (curr >= '0' && curr <= '6'))) {
                count += encode(chars, length - 2);
            }
            return count;
        }
    }
}