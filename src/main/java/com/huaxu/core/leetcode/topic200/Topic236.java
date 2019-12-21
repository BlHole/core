package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic236</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/14 21:51</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic236 {

    public class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {//当遍历到叶结点后就会返回null
                return root;
            }
            if (root == p || root == q) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return root;

            } else if (left != null) {
                return left;

            } else if (right != null) {
                return right;
            }
            return null;
        }
    }
}