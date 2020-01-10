package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/09 18:47</p>
 * <p>author：huaxu</p>
 */
public class Topic112 {

    class Pair {
        TreeNode node;
        Integer sum;
        public Pair(TreeNode node, Integer sum) {
            this.node = node;
            this.sum = sum;
        }
    }

    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) return false;
            LinkedList<Pair> queue = new LinkedList<>();
            queue.offer(new Pair(root, root.val));

            while (!queue.isEmpty()) {
                Pair pair = queue.poll();
                if (pair.node.left == null && pair.node.right == null && pair.sum == sum) {
                    return true;
                }
                if (pair.node.left != null) {
                    queue.offer(new Pair(pair.node.left, pair.node.left.val + pair.sum));
                }
                if (pair.node.right != null) {
                    queue.offer(new Pair(pair.node.right, pair.node.right.val + pair.sum));
                }
            }
            return false;
        }
    }
}