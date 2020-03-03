package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/03 16:55</p>
 * <p>author：huaxu</p>
 */
public class Topic58_2 {

    class Solution {
        public String reverseLeftWords(String s, int n) {
            n %= s.length();
            String head = s.substring(n, s.length());
            String tail = s.substring(0, n);
            return head + tail;
        }
    }
}