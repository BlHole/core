package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic235_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/02 20:24</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic235_2 {

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) return root;

            if (p.val < root.val && q.val < root.val) {
                return lowestCommonAncestor(root.left, p , q);
            }
            if (p.val > root.val && q.val > root.val) {
                return lowestCommonAncestor(root.right, p , q);
            }
            return root;
        }
    }
}