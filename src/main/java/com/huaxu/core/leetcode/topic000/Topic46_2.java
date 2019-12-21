package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_46_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/25 18:48</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic46_2 {

    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            backTrack(res, nums, new ArrayList<>(), new boolean[nums.length]);
            return res;
        }
        public void backTrack(List<List<Integer>> res, int[] nums, ArrayList<Integer> temp, boolean[] visited){
            if(temp.size()==nums.length){
                res.add(new ArrayList<>(temp));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if (!visited[i]) {
                    visited[i] = true;
                    temp.add(nums[i]);
                    backTrack(res, nums, temp, visited);
                    temp.remove(temp.size()-1);
                    visited[i] = false;
                }
            }
        }
    }
}