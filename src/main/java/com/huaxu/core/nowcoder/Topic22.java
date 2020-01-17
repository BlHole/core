package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/17 14:23</p>
 * <p>author：huaxu</p>
 *
 *
 * 从上往下打印二叉树
 *
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 * links: https://www.nowcoder.com/questionTerminal/7fe2212963db4790b57431d9ed259701
 */
public class Topic22 {

    static public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        if (root == null) return new ArrayList<>();

        ArrayList<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.pollFirst();
            res.add(treeNode.val);

            if (treeNode.left != null) {
                queue.addLast(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.addLast(treeNode.right);
            }
        }
        return res;
    }
}