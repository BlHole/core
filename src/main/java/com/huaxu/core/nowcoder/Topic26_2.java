package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/18 10:49</p>
 * <p>author：huaxu</p>
 */
public class Topic26_2 {


    public TreeNode Convert(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) {
            return root;
        }

        TreeNode left = Convert(root.left);
        TreeNode tail = left;

        while (tail != null && tail.right != null) {
            tail = tail.right;
        }

        if (left != null) {
            tail.right = root;
            root.left = tail;
        }
        TreeNode right = Convert(root.right);
        if (right != null) {
            right.left = root;
            root.right = right;
        }
        return left == null ? root : left;
    }
}