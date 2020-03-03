package com.huaxu.core.leetcode.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/03 16:33</p>
 * <p>author：huaxu</p>
 */
public class Topic57_2_2 {

    public static void main(String[] args) {
        new Topic57_2_2().new Solution().findContinuousSequence(15);
    }

    class Solution {

        private List<int[]> res = new ArrayList<>();

        public int[][] findContinuousSequence(int target) {
            for (int i = 1, limit = (target + 1) / 2; i < limit; i ++) {
                int j = i + 1, temp = target - i;
                while (j <= limit) {
                    temp -= j;
                    if (temp == 0) {
                        int[] arr = new int[j - i + 1];
                        for (int l = i, r = j, index = 0; l <= r; l ++) {
                            arr[index ++] = l;
                        }
                        System.out.println(Arrays.toString(arr));
                        res.add(arr);
                    }
                    if (temp < 0) {
                        break;
                    }
                    j ++;
                }
            }
            int[][] xx = new int[res.size()][];
            res.toArray(xx);
            return xx;
        }
    }
}