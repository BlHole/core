package com.huaxu.core.leetcode.topic300;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 10:01</p>
 * <p>author：huaxu</p>
 */
public class Topic389 {

    class Solution {
        public char findTheDifference(String s, String t) {
            char[] as = s.toCharArray();
            char[] at = t.toCharArray();

            int res = 0;
            for (char a : as) {
                res ^= a;
            }
            for (char a : at) {
                res ^= a;
            }
            return (char)res;
        }
    }
}