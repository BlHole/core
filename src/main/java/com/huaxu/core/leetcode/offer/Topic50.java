package com.huaxu.core.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 17:14</p>
 * <p>author：huaxu</p>
 */
public class Topic50 {

    class Solution {
        public char firstUniqChar(String s) {
            if (s.length() == 0) return ' ';
            char[] arr = s.toCharArray();
            Map<Character, Integer> set = new HashMap<>();
            for (Character ss : arr) {
                set.put(ss, set.get(ss) == null ? 1 : 2);
            }
            for (int i = 0; i < s.length(); i ++) {
                if (set.get(arr[i]) == 1) {
                    return arr[i];
                }
            }
            return ' ';
        }
    }
}