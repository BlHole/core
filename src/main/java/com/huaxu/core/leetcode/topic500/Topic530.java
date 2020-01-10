package com.huaxu.core.leetcode.topic500;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/09 20:12</p>
 * <p>author：huaxu</p>
 */
public class Topic530 {

    class Solution {
        public int getMinimumDifference(TreeNode root) {
            Integer res = Integer.MAX_VALUE, prev = Integer.MAX_VALUE;
            Stack<TreeNode> stack = new Stack<>();
            while (true) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                if (stack.isEmpty()) break;
                TreeNode node = stack.pop();
                res = Math.min(res, Math.abs(node.val - prev));
                prev = node.val;
                root = node.right;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        int minimumDifference = new Topic530().new Solution().getMinimumDifference(TreeNode.buildTree(new Integer[]{1, null, 3, null, null, 2}));
        System.out.println(minimumDifference);
    }
}