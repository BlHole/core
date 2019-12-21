package com.huaxu.core.leetcode.topic000;

import java.util.Arrays;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic88</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/29 21:08</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic88 {

    public static void main(String[] args) {
        new Topic88().new Solution().merge(new int[]{2,0}, 1, new int[]{1}, 1);
    }

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] olds = Arrays.copyOf(nums1, m);
            int i=0, j=0, index=0;
            while (i!=m || j!=n) {
                if (i == m) {
                    nums1[index++] = nums2[j++];
                    continue;
                }
                if (j == n) {
                    nums1[index++] = olds[i++];
                    continue;
                }
                if (nums2[j] < olds[i]) {
                    while (j != n && nums2[j] < olds[i]) {
                        nums1[index++] = nums2[j++];
                    }
                } else {
                    nums1[index++] = olds[i++];
                }
            }
        }
    }
}