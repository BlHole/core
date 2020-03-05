package com.huaxu.core.leetcode.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 11:12</p>
 * <p>author：huaxu</p>
 */
public class Topic33_2 {

    class Solution {
        public boolean verifyPostorder(int[] postorder) {
            if (postorder.length < 2) return true;
            return checkLegal(postorder, 0, postorder.length - 1);
        }

        // [1,3,2,6,5]
        // [3,10,6,9,2]
        private boolean checkLegal(int[] postorder, int left, int right) {
            if (left >= right) return true;

            int index = left;
            while (index < right && postorder[index] < postorder[right]) {
                index ++;
            }
            for (int i = index; i < right; i++) {
                if (postorder[i] < postorder[right]) {
                    return false;
                }
            }
            return checkLegal(postorder, left, index - 1) && checkLegal(postorder, index, right - 1);
        }
    }
}