package com.huaxu.core.leetcode.offer;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/03 17:04</p>
 * <p>author：huaxu</p>
 */
public class Topic59 {


    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int len = nums.length;
            if (len == 0){
                return new int[0];
            }

            int[] res = new int[len - k + 1];
            int maxInd = -1, max = Integer.MIN_VALUE;

            for (int i = 0; i < len - k + 1; i++) {
                //判断最大值下标是否在滑动窗口的范围内
                if (maxInd >= i && maxInd < i + k){
                    if (nums[i + k - 1] > max){
                        max = nums[i + k - 1];
                        maxInd = i + k - 1;
                    }
                }
                else {
                    max = nums[i];
                    for (int j = i; j < i + k; j++) {
                        if (max < nums[j]) {
                            max = nums[j];
                            maxInd = j;
                        }
                    }
                }
                res[i] = max;
            }
            return res;
        }
    }
}