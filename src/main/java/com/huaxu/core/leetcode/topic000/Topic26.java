package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic26</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/16 22:26</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic26 {

    public static void main(String[] args) {
        int i = new Solution().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        System.out.println(i);
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int i=0,j=1,length = nums.length;
            while (j < length) {
                while (nums[i] == nums[j]) {
                    if (++j == length) break;
                }
                if (j < length) {
                    nums[++i] = nums[j];
                }
            }
            return i+1;
        }
    }
}