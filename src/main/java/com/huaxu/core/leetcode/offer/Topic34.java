package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 14:17</p>
 * <p>author：huaxu</p>
 */
public class Topic34 {

    public static void main(String[] args) {
        List<List<Integer>> lists = new Topic34().new Solution().pathSum(TreeNode.buildTree(
                new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1}), 22);

        System.out.println(lists);
    }

    /**
     *
     *               5
     *              / \
     *             4   8
     *            /   / \
     *           11  13  4
     *          /  \    / \
     *         7    2  5   1
     *
     */
    class Solution {

        private Set<List<Integer>> res = new HashSet<>();

        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            if (root == null) {
                return new ArrayList<>();
            }
            solution(root, sum, new Stack<>(), 0);
            return new ArrayList<>(res);
        }

        private void solution(TreeNode root, int sum, Stack<Integer> item, int curr) {
            if (root == null || curr > sum) return;

            item.add(root.val);
            curr += root.val;

            if (root.left == null && root.right == null && curr == sum) {
                res.add(new ArrayList<>(item));
                return;
            }
            if (root.left != null) {
                solution(root.left, sum, item, curr);
                item.pop();
                return;
            }
            if (root.right != null) {
                solution(root.right, sum, item, curr);
                item.pop();
                return;
            }
        }
    }

    class Solution2 {
        List<List<Integer>> res = new ArrayList<>();
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            if (root == null) {
                return res;
            }
            dfs(root, new ArrayList<>(), sum);
            return res;
        }

        private void dfs(TreeNode node, List<Integer> list, int sum) {
            list.add(node.val);
            if (sum - node.val == 0 && node.left == null && node.right == null) {
                res.add(new ArrayList<>(list));
                return;
            }
            if (node.left != null) {
                dfs(node.left, list, sum - node.val);
                list.remove(list.size() - 1);
            }
            if (node.right != null) {
                dfs(node.right,list, sum - node.val);
                list.remove(list.size() - 1);
            }
        }
    }
}