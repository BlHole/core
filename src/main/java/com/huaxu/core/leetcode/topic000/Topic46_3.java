package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic46_3</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/25 19:46</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic46_3 {

    public static void main(String[] args) {
        List<List<Integer>> permute = new Topic46_3().new Solution().permute(new int[]{4,5,6});
        System.out.println(permute.toString());
    }

    class Solution {
        public void backtrack(int n,
                              ArrayList<Integer> nums,
                              List<List<Integer>> output,
                              int first) {
            if (first == n)
                output.add(new ArrayList<>(nums));
            for (int i = first; i < n; i++) {
                Collections.swap(nums, first, i);
                backtrack(n, nums, output, first + 1);
                Collections.swap(nums, first, i);
            }
        }

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> output = new LinkedList();
            ArrayList<Integer> nums_lst = new ArrayList<>();
            for (int num : nums)
                nums_lst.add(num);

            int n = nums.length;
            backtrack(n, nums_lst, output, 0);
            return output;
        }
    }
}