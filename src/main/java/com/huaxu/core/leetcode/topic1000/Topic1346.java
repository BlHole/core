package com.huaxu.core.leetcode.topic1000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/11 09:42</p>
 * <p>author：huaxu</p>
 */
public class Topic1346 {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(i * 2) && i != map.get(i * 2))
                return true;
        }
        return false;
    }
}