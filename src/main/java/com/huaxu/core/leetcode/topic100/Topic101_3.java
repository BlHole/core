package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/07 15:14</p>
 * <p>author：huaxu</p>
 */
public class Topic101_3 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> queueA = new LinkedList<>();
        LinkedList<TreeNode> queueB = new LinkedList<>();
        queueA.addLast(root);
        queueB.addLast(root);
        while (!queueA.isEmpty() && !queueB.isEmpty()) {
            TreeNode popA = queueA.pollFirst();
            TreeNode popB = queueB.pollFirst();
            if (popA == null && popB == null) continue;
            if (popA == null || popB == null) return false;

            if (popA.val != popB.val) return false;
            queueA.addLast(popA.left);
            queueA.addLast(popA.right);

            queueB.addLast(popB.right);
            queueB.addLast(popB.left);
        }
        return queueA.isEmpty() && queueB.isEmpty();
    }
}