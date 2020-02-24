package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 17:36</p>
 * <p>author：huaxu</p>
 */
public class Topic53 {

    class Solution {
        public int search(int[] nums, int target) {
            if (nums.length == 0) return 0;
            int low = 0, high = nums.length - 1, cnt = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    cnt ++;
                    int temp = mid - 1;
                    while(temp >= 0 && nums[temp --] == target) cnt++;
                    temp = mid + 1;
                    while(temp < nums.length && nums[temp ++ ] == target) cnt++;
                    break;
                } else if (nums[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return cnt;
        }

    }
}