package com.huaxu.core.leetcode.topic200;

import java.util.*;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic215</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/06 20:16</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic215 {

    public static void main(String[] args) {
        int kthLargest = new Topic215().new Solution().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        System.out.println(kthLargest);
    }

    class Solution {
        public int findKthLargest(int[] nums, int k) {
            int length = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < length; i++) {
                if (i == length-k) return nums[i];
            }
            return 0;
        }
    }
}