package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 16:46</p>
 * <p>author：huaxu</p>
 */
public class Topic07 {

    // 前序遍历 preorder = [3,9,20,15,7]
    // 中序遍历 inorder = [9,3,15,20,7]

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < inorder.length; i ++) {
                map.put(inorder[i], i);
            }
            return solution(preorder, 0, preorder.length, 0, inorder.length,  map);
        }

        private TreeNode solution(int[] preorder, int i, int pL, int j, int iL, Map<Integer,Integer> map) {
            if (i > pL || j > iL) {
                return null;
            }
            int inorderIndex = map.get(preorder[i]);

            TreeNode root = new TreeNode(preorder[i]);
            root.left = solution(preorder, i + 1, i + inorderIndex - j, j, inorderIndex - 1, map);
            root.right = solution(preorder, i + inorderIndex - j + 1, pL, inorderIndex + 1, iL, map);
            return root;
        }
    }
}