package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic11</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/15 22:15</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic11 {


    class Solution {
        public int maxArea(int[] height) {
            int length = height.length;
            int area = 0;
            for (int i = 0; i < length; i++) {
                for (int j = i+1; j < length; j++) {
                    area = Math.max(area, Math.min(height[i], height[j]) * (j-i));
                }
            }
            return area;
        }
    }
}