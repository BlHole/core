package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/30 16:20</p>
 * <p>author：huaxu</p>
 *
 * 把二叉树打印成多行
 *
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 * Links：https://www.nowcoder.com/questionTerminal/445c44d982d04483b04a54f298796288
 */
public class Topic57 {

    class LayerNode {
        TreeNode node;
        int h;
        public LayerNode(TreeNode node, int h) {
            this.node = node;
            this.h = h;
        }
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;

        LinkedList<LayerNode> queue = new LinkedList<>();
        queue.addLast(new LayerNode(pRoot, 0));
        while (!queue.isEmpty()) {
            LayerNode pop = queue.pollFirst();
            int h = pop.h;
            if (res.size() <= h) {
                res.add(new ArrayList<>());
            }
            res.get(h).add(pop.node.val);
            if (pop.node.left != null) {
                queue.addLast(new LayerNode(pop.node.left, h + 1));
            }
            if (pop.node.right != null) {
                queue.addLast(new LayerNode(pop.node.right, h + 1));
            }
        }
        return res;
    }
}