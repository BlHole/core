package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/17 15:27</p>
 * <p>author：huaxu</p>
 *
 * 二叉树中和为某一个值的路径
 *
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 *
 * links: https://www.nowcoder.com/questionTerminal/b736e784e3e34731af99065031301bca
 */
public class Topic24 {

    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    private Stack<Integer> stack = new Stack<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null || target < 0) {
            return result;
        }

        stack.add(root.val);
        target -= root.val;

        if(target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<>(stack));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        stack.pop();
        return result;
    }
}