package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/07 15:00</p>
 * <p>author：huaxu</p>
 */
public class Topic101_2 {

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