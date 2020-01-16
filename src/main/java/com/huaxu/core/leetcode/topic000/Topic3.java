package com.huaxu.core.leetcode.topic000;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 10:56</p>
 * <p>author：huaxu</p>
 */
public class Topic3 {

    public static void main(String[] args) {

        int length = new Topic3().new Solution().lengthOfLongestSubstring("pwwkew");
        System.out.println(length);
    }

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int i = 0, j = 0, length = s.length(), max = 0;
            Set<Character> set = new HashSet<>();
            while (i < length && j < length) {
                if (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(i++));
                    max = Math.max(max, i - j);
                } else set.remove(s.charAt(j++));
            }
            return max;
        }
    }
}