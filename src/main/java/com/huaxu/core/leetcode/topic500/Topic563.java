package com.huaxu.core.leetcode.topic500;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/09 20:42</p>
 * <p>author：huaxu</p>
 */
public class Topic563 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        int sum = 0;
        public int findTilt(TreeNode root) {
            traverse(root);
            return sum;
        }

        public int traverse(TreeNode root) {
            if (root == null) return 0;
            int left = traverse(root.left);
            int right = traverse(root.right);
            sum += Math.abs(left - right);
            return left + right + root.val;
        }
    }
}