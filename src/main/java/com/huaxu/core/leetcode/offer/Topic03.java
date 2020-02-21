package com.huaxu.core.leetcode.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/21 11:41</p>
 * <p>author：huaxu</p>
 */
public class Topic03 {

    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return num;
                } else set.add(num);
            }
            return -1;
        }
    }
}