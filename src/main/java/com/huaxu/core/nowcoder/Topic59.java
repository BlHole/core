package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/31 08:59</p>
 * <p>author：huaxu</p>
 *
 * 二叉搜索树中的第K个结点
 *
 * 题目描述
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如（5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
 *
 * links: https://www.nowcoder.com/questionTerminal/ef068f602dde4d28aab2b210e859150a
 */
public class Topic59 {


    TreeNode KthNode(TreeNode pRoot, int k) {
        Stack<TreeNode> stack = new Stack<>();

        while (true) {
            while (pRoot != null) {
                stack.push(pRoot);
                pRoot = pRoot.left;
            }
            if (stack.isEmpty()) break;
            TreeNode pop = stack.pop();
            System.out.println(pop.val);
            if (-- k == 0) {
                return pop;
            }
            pRoot = pop.right;
        }
        return null;
    }
}