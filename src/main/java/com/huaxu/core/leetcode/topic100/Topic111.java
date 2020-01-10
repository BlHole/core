package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/09 18:10</p>
 * <p>author：huaxu</p>
 */
public class Topic111 {

    class Pair {
        TreeNode node;
        Integer height;
        public Pair(TreeNode node, Integer height) {
            this.node = node;
            this.height = height;
        }
    }
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;

            Stack<Pair> stack = new Stack<>();
            stack.push(new Pair(root, 1));

            int res = Integer.MAX_VALUE;
            while (!stack.isEmpty()) {
                Pair pair = stack.pop();
                if (pair.node.left == null && pair.node.right == null) {
                    res = Math.min(pair.height, res);
                }
                if (pair.node.left != null){
                    stack.push(new Pair(pair.node.left, pair.height + 1));
                }
                if (pair.node.right != null) {
                    stack.push(new Pair(pair.node.right, pair.height + 1));
                }
            }
            return res;
        }
    }
}