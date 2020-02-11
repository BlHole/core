package com.huaxu.core.leetcode.topic1000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/11 10:11</p>
 * <p>author：huaxu</p>
 */
public class Topic1347 {

    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }
        int res = 0;
        for (char c : s.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else res ++;
        }
        return res;
    }
}