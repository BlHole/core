package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>date: 2019/09/29 15:21</p>
 * <p>@author：huaxu</p>
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Topic230 {

    static class Solution {
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> print = print(root, new ArrayList<>());
            Collections.sort(print);
            return print.get(k-1);
        }
        public List<Integer> print(TreeNode node, List<Integer> list){
            if (node == null) return list;
            print(node.right, list);
            print(node.left, list);
            list.add(node.val);
            return list;
        }
    }
}