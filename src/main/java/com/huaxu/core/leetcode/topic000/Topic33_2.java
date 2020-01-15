package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/15 10:43</p>
 * <p>author：huaxu</p>
 */
public class Topic33_2 {

    public static void main(String[] args) {
        int search = new Topic33_2().new Solution().search(new int[]{5, 1, 3}, 3);
        System.out.println(search);
    }

    /**
     *  假设按照升序排序的数组在预先未知的某个点上进行了旋转。
     * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
     * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
     * 你可以假设数组中不存在重复的元素。
     * 你的算法时间复杂度必须是 O(log n) 级别。
     */
    class Solution {
        public int search(int[] nums, int target) {
            return solution(nums, target, 0, nums.length - 1);
        }

        private int solution(int[] nums, int target, int left, int right) {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (target == nums[mid]) {
                    return mid;
                }
                // rotation point is to the right && target value is also on the right
                if (nums[mid] > nums[right] && (target < nums[left] || target > nums[mid])) {
                    return solution(nums, target, mid + 1, right);
                }
                // rotation point is to the left && target value is also on the left
                if (nums[mid] < nums[left] && (target < nums[mid] || target > nums[right])) {
                    return solution(nums, target, left, mid - 1);
                }
                if (target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }
    /**
     *  6,7,0,1,2,3,4   mid = 3, left = 0, right = 6; target = 6
     *  6,7,8,9,10,2,4   mid = 3, left = 0, right = 6; target = 2
     */
}