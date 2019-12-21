package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/17 10:46</p>
 * <p>author：huaxu</p>
 */
public class Topic101 {

    static class Solution {
        public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode t1 = queue.poll();
                TreeNode t2 = queue.poll();
                if (t1 == null && t2 == null) continue;
                if (t1 == null || t2 == null) return false;
                if (t1.val != t2.val) return false;
                queue.add(t1.left);
                queue.add(t2.right);

                queue.add(t1.right);
                queue.add(t2.left);
            }
            return true;
        }
    }

}