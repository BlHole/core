package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 15:00</p>
 * <p>author：huaxu</p>
 */
public class Topic05 {

    class Solution {
        public String replaceSpace(String s) {
            if (s == null || s.length() == 0) return s;
            return s.replaceAll(" ", "%20");
        }
    }
}