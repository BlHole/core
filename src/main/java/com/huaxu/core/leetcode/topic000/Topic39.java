package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 14:32</p>
 * <p>author：huaxu</p>
 */
public class Topic39 {

    public static void main(String[] args) {
        List<List<Integer>> lists = new Topic39().new Solution().combinationSum(new int[]{2, 3, 6, 7}, 7);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println("-----------");
        }
    }

    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            combinationSum(candidates, target, 0, new Stack<>(), res);
            return res;
        }

        private void combinationSum(int[] candidates, int target, int index, Stack<Integer> stack, List<List<Integer>> res) {
            if (target < 0) return;
            if (target == 0) {
                res.add(new ArrayList<>(stack));
                return;
            }

            for (int i = index; i < candidates.length; i++) {
                stack.push(candidates[i]);
                combinationSum(candidates, target - candidates[i], i, stack, res);
                stack.pop();
            }
        }
    }
}