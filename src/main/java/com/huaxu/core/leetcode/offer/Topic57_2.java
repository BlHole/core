package com.huaxu.core.leetcode.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/03 15:35</p>
 * <p>author：huaxu</p>
 */
public class Topic57_2 {

    public static void main(String[] args) {
        new Topic57_2().new Solution().findContinuousSequence(50252);
    }

    class Solution {

        private List<int[]> res = new ArrayList<>();

        public int[][] findContinuousSequence(int target) {
            int limit = (target + 1)/ 2;
            for (int i = 1 ; i <= limit; i++) {
                List<Integer> list = new ArrayList<>();
                dfs(i, limit, target - i, list);
            }
            int[][] zz = new int[res.size()][];
            res.toArray(zz);
            return zz;
        }

        private void dfs(int i, int l, int target, List<Integer> list) {
            if (i > l || target < 0) {
                list.clear();
                return;
            }
            list.add(i);
            if (target == 0) {
                int x = 0;
                int[] arr = new int[list.size()];
                for (Integer integer : list) {
                    arr[x ++] = integer;
                }
                res.add(arr);
                return;
            }
            int step = i + 1;
            if (target >= step) {
                dfs(step, l, target - step, list);
            }
        }
    }
}