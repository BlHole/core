package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 18:25</p>
 * <p>author：huaxu</p>
 */
public class Topic68_2 {

    class Solution {

        private int index = 0;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            Map<TreeNode, Integer> map = new HashMap<>();
            traverse(root, map);

            return solution(root, p, q, map);
        }

        private TreeNode solution(TreeNode root, TreeNode p, TreeNode q, Map<TreeNode, Integer> map) {
            if (root == null) return root;

            if (map.get(p) < map.get(root) && map.get(q) < map.get(root)) return solution(root.left, p, q, map);
            if (map.get(p) > map.get(root) && map.get(q) > map.get(root)) return solution(root.right, p, q, map);
            return root;
        }

        private void traverse(TreeNode root, Map<TreeNode, Integer> map) {
            if (root != null) {
                traverse(root.left, map);
                map.put(root, index ++);
                traverse(root.right, map);
            }
        }
    }
}