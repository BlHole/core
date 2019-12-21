package com.huaxu.core.leetcode.topic500;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/17 11:33</p>
 * <p>author：huaxu</p>
 */
public class Topic543 {

    class Solution {
        int ans = 1;
        public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return ans - 1;
        }
        public int depth(TreeNode node) {
            if (node == null) return 0;
            int L = depth(node.left);
            int R = depth(node.right);
            ans = Math.max(ans, L + R + 1);
            return Math.max(L, R) + 1;
        }
    }
}