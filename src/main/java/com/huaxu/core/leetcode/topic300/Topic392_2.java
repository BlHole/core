package com.huaxu.core.leetcode.topic300;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/06 13:24</p>
 * <p>author：huaxu</p>
 */
public class Topic392_2 {

    class Solution {
        public boolean isSubsequence(String s, String t) {
            int index = -1;
            for (char c : s.toCharArray()) {
                index = t.indexOf(c, index+1);
                if (index == -1)
                    return false;
            }
            return true;
        }
    }
}