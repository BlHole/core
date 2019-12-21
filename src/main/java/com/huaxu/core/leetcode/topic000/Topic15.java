package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic15</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/17 19:50</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic15 {

    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists.toString());

    }
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> tuples = new ArrayList<>();

            for(int i = 0; i < nums.length-2; i++){
                if(i > 0 && nums[i-1] == nums[i]) continue; //去重

                int l = i+1, r = nums.length-1;
                if(nums[l] < 0 && Integer.MIN_VALUE-nums[l] > nums[i]) continue; //如果溢出最小值则跳过
                if(nums[i] > 0 && Integer.MAX_VALUE-nums[l] < nums[i]) break; //溢出最大值直接结束，不可能会有新的三元组出现了

                while(l < r){
                    if(nums[r] > -nums[i]-nums[l]){
                        while(l < r && nums[r-1] == nums[r]) r--; //右指针去重
                        r--;
                    }
                    else if(nums[r] < -nums[i]-nums[l]){
                        while(l < r && nums[l+1] == nums[l]) l++; //左指针去重
                        l++;
                    }
                    else{
                        tuples.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while(l < r && nums[r-1] == nums[r]) r--; //左指针去重
                        while(l < r && nums[l+1] == nums[l]) l++; //右指针去重
                        r--;
                        l++;
                    }
                }
            }
            return tuples;
        }
    }
}