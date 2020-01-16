package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 20:19</p>
 * <p>author：huaxu</p>
 *
 *
 * 二叉树的镜像
 *
 * 题目描述
 *      操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * 输入描述:
 *      二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 *
 *
 * links: https://www.nowcoder.com/questionTerminal/564f4c26aa584921bc75623e48ca3011
 */
public class Topic18 {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.buildTree(new Integer[]{8, 6, 10, 5, 7, 9, 11});
        Mirror(treeNode);
        System.out.println(treeNode);
    }

    static public void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;

        Mirror(root.left);
        Mirror(root.right);

        root.left = right;
        root.right = left;
    }
}