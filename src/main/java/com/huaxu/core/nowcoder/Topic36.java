package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 17:43</p>
 * <p>author：huaxu</p>
 *
 * 二叉树的深度
 *
 * 题目描述
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * links: https://www.nowcoder.com/questionTerminal/435fb86331474282a3499955f0a41e8b
 */
public class Topic36 {

    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(TreeDepth(root.left) + 1, TreeDepth(root.right) + 1);
    }
}