package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 18:07</p>
 * <p>author：huaxu</p>
 */
public class Topic68 {

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) return root;
            if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
            if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
            return root;
        }
    }
}