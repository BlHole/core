package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 15:54</p>
 * <p>author：huaxu</p>
 */
public class Topic26 {

    public static void main(String[] args) {

        // [10,12,6,8,3,11]
        // [10,12,6,8]
        boolean subStructure = new Topic26().new Solution().isSubStructure(
                TreeNode.buildTree(new Integer[]{10,12,6,8,3,11}),
                TreeNode.buildTree(new Integer[]{10,12,6,8}));
        System.out.println(subStructure);
    }

    class Solution {

        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if(A == null || B == null){
                return false;
            }
            if(A.val == B.val){
                return issub(A,B);
            }
            return isSubStructure(A.left,B) || isSubStructure(A.right,B);
        }

        //判断是否是子树
        public boolean issub(TreeNode A, TreeNode B){
            if(B == null){
                return true;
            }
            if(A == null && B != null){
                return false;
            }
            if(A.val == B.val){
                return issub(A.left,B.left) && issub(A.right,B.right);
            }
            return false;
        }
    }
}