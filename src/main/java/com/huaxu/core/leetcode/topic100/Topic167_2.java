package com.huaxu.core.leetcode.topic100;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/24 18:19</p>
 * <p>author：huaxu</p>
 */
public class Topic167_2 {

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            Map<Integer, Integer> map = new HashMap<>(numbers.length);
            for (int i = 0, length = numbers.length; i < length; i ++) {
                map.put(numbers[i], i);
            }
            for (int i = 0, length = numbers.length; i < length; i ++) {
                Integer targetF = map.get(target - numbers[i]);
                if ( targetF != null && i != targetF ) {
                    targetF ++; i ++;
                    return new int[] {Math.min(i, targetF), Math.max(i, targetF)};
                }
            }
            return null;
        }
    }
}