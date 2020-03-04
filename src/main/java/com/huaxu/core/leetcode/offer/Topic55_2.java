package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 18:00</p>
 * <p>author：huaxu</p>
 */
public class Topic55_2 {

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            return Math.abs(getTreeH(root.left) - getTreeH(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

        private int getTreeH(TreeNode root) {
            return root == null ? 0 : Math.max(getTreeH(root.left), getTreeH(root.right)) + 1;
        }
    }
}