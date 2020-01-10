package com.huaxu.core.leetcode.topic400;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/09 19:49</p>
 * <p>author：huaxu</p>
 */
public class Topic437 {

    class Solution {

        public int pathSum(TreeNode root, int sum) {
            if (root == null) return 0;
            int res = 0;
            Map<TreeNode, Integer> map = new HashMap<>();
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (map.containsKey(node)) {
                    res += map.get(node);
                } else {
                    int solution = solution(node, sum);
                    map.put(node, solution);
                    res += solution;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            return res;
        }

        private int solution(TreeNode root, int sum) {
            if (root == null) return 0;
            int res = sum == root.val ? 1 : 0;
            return solution(root.left, sum - root.val) + solution(root.right, sum - root.val) + res;
        }
    }
}