package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;
import lombok.val;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>date: 2019/09/29 16:00</p>
 * <p>@author：huaxu</p>
 */
public class Topic230_3 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);

        t3.left = t1;
        t3.right = t4;
        t1.right = t2;
        int i = new Topic230_3.Solution().kthSmallest(t3, 1);
        System.out.println(i);
    }



    static class Solution {

        private int step = 1;
        private int result = -1;

        public int kthSmallest(TreeNode root, int k) {
            return inOrderTraversal(root, k);
        }

        public int inOrderTraversal(TreeNode root, int target) {
            if (root == null)
                return result;

            inOrderTraversal(root.left, target);
            if (step++ == target) {
                result = root.val;
            }
            inOrderTraversal(root.right, target);
            return result;
        }
    }
}