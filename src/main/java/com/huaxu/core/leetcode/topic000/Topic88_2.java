package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic88_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/29 22:13</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic88_2 {

    public static void main(String[] args) {
        new Topic88_2().new Solution().merge(new int[]{1,5,6,7,0,0}, 4, new int[]{8,9}, 2);
    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int p = m-- + n-- - 1;
            while (m >= 0 && n >= 0) {
                nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            }
            while (n >= 0) {
                nums1[p--] = nums2[n--];
            }
        }
    }
}