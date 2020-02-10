package com.huaxu.core.leetcode.topic000;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/10 17:20</p>
 * <p>author：huaxu</p>
 */
public class Topic3_2 {

    public static void main(String[] args) {

        Solution solution = new Topic3_2().new Solution();
        System.out.println(solution.lengthOfLongestSubstring("aaaa"));

    }

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int max = 0;
            for (int fast = 0, slow = 0; fast < s.length(); fast ++) {
                if (map.containsKey(s.charAt(fast))) {
                    int target = map.get(s.charAt(fast)) + 1;
                    slow = target < slow ? slow : target;
                }
                map.put(s.charAt(fast), fast);
                max = Math.max(max, fast - slow + 1);
            }
            return max;
        }
    }
}