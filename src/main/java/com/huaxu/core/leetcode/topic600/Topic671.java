package com.huaxu.core.leetcode.topic600;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/10 10:38</p>
 * <p>author：huaxu</p>
 */
public class Topic671 {

    class Solution {
        public int findSecondMinimumValue(TreeNode root) {
            if (root == null || root.left == null) return -1;
            int limit = Integer.MAX_VALUE;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                if (node.val != root.val) {
                    limit = Math.min(limit, node.val - root.val);
                }
                if (node.left != null) {
                    stack.push(node.left);
                    stack.push(node.right);
                }
            }
            return limit == Integer.MAX_VALUE ? -1 : root.val + limit;
        }
    }
}