package com.huaxu.core;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/12 17:18</p>
 * <p>author：huaxu</p>
 */
public class TestTreeNode {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t3.left = t2;
        t2.left = t1;
        t3.right = t4;
        t4.left = t5;
        t4.right = t6;
        new TestTreeNode().isUnivalTree(t3);

    }

    public void isUnivalTree(TreeNode root) {
        if (root != null) {
            isUnivalTree(root.left);
            System.out.println(root.val);
            isUnivalTree(root.right);
        }
    }
}