package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic11_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/15 22:57</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic11_2 {

    class Solution {
        public int maxArea(int[] height) {
            int i=0, j=height.length-1, area = -1;
            while (i < j){
                area = Math.max(area, Math.min(height[i], height[j]) * (j-i));
                if (height[i] < height[j]) {
                    i++;
                } else {
                    j--;
                }
            }
            return area;
        }
    }
}