package com.huaxu.core.leetcode.topic600;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/15 14:43</p>
 * <p>author：huaxu</p>
 */
public class Topic617 {

    static class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null) return t2;
            if (t2 == null) return t1;

            t1.val = t1.val + t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            return t1;
        }
    }
}