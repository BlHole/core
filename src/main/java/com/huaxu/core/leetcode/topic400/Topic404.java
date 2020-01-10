package com.huaxu.core.leetcode.topic400;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/09 18:49</p>
 * <p>author：huaxu</p>
 */
public class Topic404 {

    class Solution {

        private int sum = 0;

        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) return 0;
            if (root.left != null && root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
            sumOfLeftLeaves(root.left);
            sumOfLeftLeaves(root.right);
            return sum;
        }
    }
}