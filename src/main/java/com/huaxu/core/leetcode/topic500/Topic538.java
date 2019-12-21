package com.huaxu.core.leetcode.topic500;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/16 17:44</p>
 * <p>author：huaxu</p>
 */
public class Topic538 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node2.right = node3;
        node2.left = node1;
        new Solution().convertBST(node2);
    }

    static class Solution {
        int add = 0;
        public TreeNode convertBST(TreeNode root) {
            if (root != null) {
                convertBST(root.right);
                root.val += add;
                add = root.val;
                convertBST(root.left);
            }
            return root;
        }
    }
}