package com.huaxu.core.leetcode.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 15:56</p>
 * <p>author：huaxu</p>
 */
public class Topic48 {

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() < 2) return s.length();
            char[] chars = s.toCharArray();
            Set<Character> set = new HashSet<>();
            int low = 0, fast = 0, max = 0;
            while (fast < s.length()) {
                if (!set.contains(chars[fast])) {
                    set.add(chars[fast ++]);
                    max = Math.max(max, fast - low);

                } else set.remove(chars[low++]);
            }
            return max;
        }
    }
}