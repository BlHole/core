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
        int i = new Topic91().new Solution().numDecodings("1234");
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
            if (s.charAt(0) == '0') return 0;

            char[] chars = s.toCharArray();
            return decode(chars, chars.length - 1);
        }

        int decode(char[] chars, int index) {
            if (index <= 0) return 1;

            int count = 0;
            char curr = chars[index];
            char prev = chars[index - 1];
            // 当前字符比 “0” 大，则直接利用它之前的字符串所求得的结果
            if (curr > '0') {
                count = decode(chars, index - 1);
            }
            // 由前一个字符和当前字符所构成的数字，值必须要在 1 到 26 之间，否则无法进行解码
            if (prev == '1' || (prev == '2' && curr <= '6')) {
                count += decode(chars, index - 2);
            }
            return count;
        }
    }
}