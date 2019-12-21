package com.huaxu.core.leetcode.topic300;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/29 18:18</p>
 * <p>author：huaxu</p>
 */
public class Topic349 {

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set1 = new HashSet<Integer>();
            for (Integer n : nums1) set1.add(n);
            HashSet<Integer> set2 = new HashSet<Integer>();
            for (Integer n : nums2) set2.add(n);

            set1.retainAll(set2);

            int [] output = new int[set1.size()];
            int idx = 0;
            for (int s : set1) output[idx++] = s;
            return output;
        }
    }
}