package com.huaxu.core.nowcoder;

import java.util.ArrayList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 14:16</p>
 * <p>author：huaxu</p>
 */
public class Topic40_2 {

    class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
            ArrayList<Integer> res = new ArrayList<>();
            int left = 0, right = array.length - 1;
            while (left < right) {
                int ans = array[left] + array[right];
                if (ans == sum) {
                    res.add(array[left]);
                    res.add(array[right]);
                    return res;
                }
                if (ans > sum) right ++;
                if (ans < sum) left ++;
            }
            return res;
        }
    }
}