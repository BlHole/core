package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic235</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/02 13:13</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic235 {

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || p == null || q == null) return null;
            if (p == root || q == root) return root;
            if (p.val >= root.val && q.val <= root.val) return root;
            if (p.val <= root.val && q.val >= root.val) return root;

            TreeNode result = null;
            if (p.val < root.val) {
                result = lowestCommonAncestor(root.left, p, q);
            } else {
                result = lowestCommonAncestor(root.right, p, q);
            }
            return result;
        }
    }
}