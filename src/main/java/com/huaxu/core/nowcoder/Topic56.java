package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/29 17:28</p>
 * <p>author：huaxu</p>
 *
 * 按之字形顺序打印二叉树
 *
 * 题目描述
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 *
 * links: https://www.nowcoder.com/questionTerminal/91b69814117f4e8097390d107d2efbe0
 */
public class Topic56 {

    ArrayList<LinkedList<Integer>> res = new ArrayList<>();

    private class LayerTree {
        TreeNode node;
        int h;
        LayerTree(TreeNode node, int h) {
            this.node = node;
            this.h = h;
        }
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<LayerTree> queue = new LinkedList<>();
        queue.addLast(new LayerTree(pRoot, 0));

        while (!queue.isEmpty()) {
            LayerTree pop = queue.pollFirst();
            if (pop != null && pop.node != null) {
                if (pop.h >= res.size()) {
                    res.add(new LinkedList<>());
                }
                res.get(pop.h).addLast(pop.node.val);
                queue.addLast(new LayerTree(pop.node.left, pop.h + 1));
                queue.addLast(new LayerTree(pop.node.right, pop.h + 1));
            }
        }
        ArrayList<ArrayList<Integer>> zz = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            ArrayList<Integer> node = new ArrayList<>();
            LinkedList<Integer> linkedList = res.get(i);
            if ((i & 1) == 1) {
                while (!linkedList.isEmpty()) {
                    node.add(linkedList.pollLast());
                }
                zz.add(node);
            } else {
                while (!linkedList.isEmpty()) {
                    node.add(linkedList.pollFirst());
                }
                zz.add(node);
            }
        }
        return zz;
    }
}