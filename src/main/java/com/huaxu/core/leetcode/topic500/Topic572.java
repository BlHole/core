package com.huaxu.core.leetcode.topic500;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/09 21:08</p>
 * <p>author：huaxu</p>
 */
public class Topic572 {


    class Solution {
        public boolean isSubtree(TreeNode s, TreeNode t) {

            if (t == null) return true;
            if (s == null) return false;

            if (s.val != t.val){
                return isSubtree(s.left, t) || isSubtree(s.right, t);
            }
            return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        }

        private boolean isSameTree(TreeNode root1, TreeNode root2){
            if(root1 == null && root2 == null) return true;
            if(root1 == null || root2 == null) return false;

            if(root1.val != root2.val) return false;
            return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
        }
    }
}