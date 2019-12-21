package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic124</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/03 20:07</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic124 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-2);
        root.left.left = new TreeNode(1);
        root.left.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(-3);
        root.right.left = new TreeNode(-2);

        int a = new Topic124().new Solution().maxPathSum(root);
        System.out.println(a);
    }

    class Solution {
        public int maxPathSum(TreeNode root) {
            if (root == null) return Integer.MIN_VALUE;
            int rootVal = root.val;
            int leftVal = maxPathSum(root.left);
            int rightVal = maxPathSum(root.right);

            if (rootVal >= 0) {
                rootVal += leftVal > 0 ? leftVal : 0;
                rootVal += rightVal > 0 ? rightVal : 0;
            } else {
                rootVal = Math.max(rootVal, leftVal);
                rootVal = Math.max(rootVal, rightVal);
            }
            return rootVal;
        }
    }
}