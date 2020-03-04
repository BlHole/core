package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 16:17</p>
 * <p>author：huaxu</p>
 */
public class Topic27 {

    public static void main(String[] args) {
        TreeNode treeNode = new Topic27().new Solution().mirrorTree(TreeNode.buildTree(new Integer[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(treeNode);
    }

    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            if (root == null) return null;
            TreeNode right = mirrorTree(root.right);
            root.right = mirrorTree(root.left);
            root.left = right;
            return root;
        }
    }
}