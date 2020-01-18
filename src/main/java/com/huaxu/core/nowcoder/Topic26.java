package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/18 10:17</p>
 * <p>author：huaxu</p>
 *
 * 二叉搜索树与双向链表
 *
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Topic26 {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        TreeNode curr = pRootOfTree;
        TreeNode flag = new TreeNode(0), prev = flag;

        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            if (stack.isEmpty()) break;
            TreeNode pop = stack.pop();
            if (prev == flag) {
                pRootOfTree = pop;
                prev = pRootOfTree;
            } else {
                prev.right = pop;
                pop.left = prev;
                prev = pop;
            }
            curr = pop.right;
        }
        return pRootOfTree;
    }
}