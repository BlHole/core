package com.huaxu.core.leetcode.topic000;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/15 10:06</p>
 * <p>author：huaxu</p>
 */
public class Topic39_2 {

    public static void main(String[] args) {
        List<List<Integer>> lists = new Topic39_2().new Solution().combinationSum(new int[]{2, 3, 6, 7}, 7);
        lists.forEach(System.out::println);
    }

    class Solution {
        private List<List<Integer>> res;

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            res = new ArrayList<>();

            solutionHelp(candidates, target, new Stack<>(), 0);
            return res;
        }

        void solutionHelp(int[] candidates, int target, Stack<Integer> ans, int index) {
            if (target < 0) return;
            if (target == 0) res.add(new ArrayList<>(ans));
            for (int i = index; i < candidates.length; i ++) {
                ans.push(candidates[i]);
                solutionHelp(candidates, target - candidates[i], ans, i);
                ans.pop();
            }
        }
    }
}