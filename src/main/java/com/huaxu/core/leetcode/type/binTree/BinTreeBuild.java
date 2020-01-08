package com.huaxu.core.leetcode.type.binTree;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/08 18:59</p>
 * <p>author：huaxu</p>
 */
public class BinTreeBuild {

    public static void main(String[] args) {
        Integer[] cols = new Integer[]{1, 2, 3, null, 4, null, 6, 7};
        TreeNode node = buildTree(cols, 0);
        System.out.println(node);
    }

    private static TreeNode buildTree(Integer[] cols, int index) {
        TreeNode root = null;
        if (index < cols.length && cols[index] != null) {
            root = new TreeNode(cols[index]);
            root.left = buildTree(cols, (index << 1) + 1);
            root.right = buildTree(cols, (index << 1) + 2);
        }
        return root;
    }
}