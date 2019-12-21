package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic15_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 11:29</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic15_2 {

    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().threeSum(new int[]{-2,0,0,2,2});
        System.out.println(lists.toString());
    }

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int limit = 3;
            if (nums == null || nums.length < limit) return new ArrayList<>();;

            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0, length = nums.length; i <= length-limit; i++) {
                if (nums[i] > 0) break; // 精髓，人脑奇迹
                if (i > 0 && nums[i] == nums[i-1]) continue;// 去重
                int l = i+1, r = length-1;

                while (l < r) {
                    if (nums[i] > -nums[l]-nums[r]) {
                        while (l < r && nums[r] == nums[r-1]) r--;// 去重
                        r--;
                    } else if (nums[i] < -nums[l]-nums[r]) {
                        while (l < r && nums[l] == nums[l+1]) l++;// 去重
                        l++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[r] == nums[r-1]) r--;
                        while (l < r && nums[l] == nums[l+1]) l++;
                        r--;
                        l++;
                    }
                }
            }
            return result;
        }
    }
}