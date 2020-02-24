package com.huaxu.core.leetcode.offer;

import net.sf.jsqlparser.statement.select.Top;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 11:40</p>
 * <p>author：huaxu</p>
 */
public class Topic45 {

    public static void main(String[] args) {

        System.out.println(new Topic45().new Solution().minNumber(new int[]{824,938,1399,5607,6973,5703,9609,4398,8247}));
    }



    class Solution {
        public String minNumber(int[] nums) {
            // 归并解法
            sort(nums, 0, nums.length - 1);

            StringBuilder sb = new StringBuilder();
            for (int num : nums) {
                sb.append(num);
            }
            return sb.toString();
        }

        private void sort(int[] nums, int low, int high) {
            if (low >= high) return;
            int mid = low + (high - low) / 2;
            sort(nums, low, mid);
            sort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }

        private void merge(int[] nums, int low, int mid, int high) {
            int index = 0, left = low, right = mid + 1;
            int[] copy = new int[nums.length];

            while (index < (high - low + 1)) {
                if (left > mid) {
                    copy[index ++] = nums[right ++];

                } else if (right > high){
                    copy[index ++] = nums[left ++];

                } else if (checkLeft(nums, left, right)) {
                    copy[index ++] = nums[left ++];

                } else {
                    copy[index ++] = nums[right ++];
                }
            }
            for (int i = 0; i < high - low + 1; i++) {
                nums[low + i] = copy[i];
            }
        }

        // [3,30,34,5,9]
        private boolean checkLeft(int[] nums, int left, int right) {
            String a = String.valueOf(nums[left]) + String.valueOf(nums[right]);
            String b = String.valueOf(nums[right]) + String.valueOf(nums[left]);
            return Long.parseLong(a) < Long.parseLong(b);
        }
    }
}