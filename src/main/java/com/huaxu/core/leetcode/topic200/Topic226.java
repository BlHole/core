package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/15 14:59</p>
 * <p>author：huaxu</p>
 */
public class Topic226 {

    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null)  return null;

            TreeNode right = invertTree(root.right);
            TreeNode left = invertTree(root.left);
            root.left = right;
            root.right = left;
            return root;
        }
    }
}