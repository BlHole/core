package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 17:57</p>
 * <p>author：huaxu</p>
 *
 * 平衡二叉树
 *
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 *
 * links: https://www.nowcoder.com/questionTerminal/8b3b95850edb4115918ecebdf1b4d222
 */
public class Topic37 {

    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepthTree(root) != -1;
    }

    private int getDepthTree(TreeNode root) {
        if (root == null) return 0;
        int left = getDepthTree(root.left);
        if (left == -1) return -1;

        int right = getDepthTree(root.right);
        if (right == -1) return -1;

        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }
}