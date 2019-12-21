package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic46</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/24 21:49</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic46 {

    public static void main(String[] args) {
        int[] ints = {4, 5, 6};
        List<List<Integer>> permute = new Topic46().new Solution().permute(ints);
        System.out.println(permute);
    }

    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            dfs(0, nums, new int[nums.length], new boolean[nums.length], result);
            return result;
        }

        public void dfs(int step, int[] nums, int[] entrys, boolean[] contain, List<List<Integer>> result){
            if (step == nums.length) {
                List<Integer> list = new ArrayList<>();
                for (int entry : entrys) {
                    list.add(nums[entry]);
                }
                result.add(list);
                return;
            }


            for (int i = 0, length = nums.length; i < length; i++) {
                if (!contain[i]) {
                    entrys[step] = i;
                    contain[i] = true;
                    dfs(step+1, nums, entrys, contain, result);
                    contain[i] = false;
                }
            }
        }
    }
}