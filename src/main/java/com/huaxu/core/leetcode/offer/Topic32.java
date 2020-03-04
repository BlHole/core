package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 17:03</p>
 * <p>author：huaxu</p>
 */
public class Topic32 {

    class Solution {
        public int[] levelOrder(TreeNode root) {
            List<Integer> res = new ArrayList<>();

            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);

            while (!queue.isEmpty()) {
                TreeNode pop = queue.pollFirst();
                if (pop != null) {
                    res.add(pop.val);
                    queue.addLast(pop.left);
                    queue.addLast(pop.right);
                }
            }
            int[] arr = new int[res.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = res.get(i);
            }
            return arr;
        }
    }
}