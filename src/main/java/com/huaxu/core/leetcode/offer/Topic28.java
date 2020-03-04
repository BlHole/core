package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 16:32</p>
 * <p>author：huaxu</p>
 */
public class Topic28 {

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return solution(root.left, root.right);
        }

        private boolean solution(TreeNode left, TreeNode right) {
            if (left == null && right == null) return true;
            if (left == null || right == null) return false;
            return left.val == right.val && solution(left.left, right.right) && solution(left.right, right.left);
        }
    }
}