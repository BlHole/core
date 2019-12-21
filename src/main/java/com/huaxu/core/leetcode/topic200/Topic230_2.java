package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>date: 2019/09/29 16:00</p>
 * <p>@author：huaxu</p>
 */
public class Topic230_2 {



    static class Solution {

        public int kthSmallest(TreeNode root, int k) {
            return inOrderTraversal(root, new ArrayList<Integer>()).get(k - 1);
        }

        public List<Integer> inOrderTraversal(TreeNode root, List<Integer> list) {
            if (root == null)
                return list;

            inOrderTraversal(root.left, list);
            list.add(root.val);
            inOrderTraversal(root.right, list);
            return list;
        }
    }
}