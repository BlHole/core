package com.huaxu.core.leetcode.type.binTree;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/04 09:48</p>
 * <p>author：huaxu</p>
 */
public class BinTreePractice {

    /**
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);

        TreeNode rightN = new TreeNode(20);
        rightN.left = new TreeNode(15);
        rightN.right = new TreeNode(7);
        root.right = rightN;

        DLR.recDLR(root);
        DLR.stackDLR(root);
        DLR.queueDLR(root);
        DLR.newDLR(root);

        LDR.recDLR(root);
        LDR.stackDLR(root);

        Level.foreach(root);

    }

    // 先序遍历
    static class DLR {
        // 递归
        private static void recDLR(TreeNode root) {
            if (root != null) {
                System.out.println(root.val);
                recDLR(root.left);
                recDLR(root.right);
            }
        }

        // 堆栈
        private static void stackDLR(TreeNode root) {
            Stack<TreeNode> stack = new Stack();
            stack.add(root);

            while (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                if (pop != null) {
                    System.out.println(pop.val);
                    stack.add(pop.right);
                    stack.add(pop.left);
                }
            }
        }

        // 队列
        private static void queueDLR(TreeNode root) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode pop = queue.pop();
                if (pop != null) {
                    System.out.println(pop.val);
                    queue.add(pop.left);
                    queue.add(pop.right);
                }
            }
        }

        // url https://www.bilibili.com/video/av49361421?p=166
        private static void newDLR(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            while (true) {
                while (root != null) {
                    System.out.println(root.val);
                    stack.push(root.right);
                    root = root.left;
                }
                if (stack.isEmpty()) break;
                root = stack.pop();
            }
        }
    }

    // 中序遍历
    static class LDR {

        // 递归
        private static void recDLR(TreeNode root) {
            if (root != null) {
                recDLR(root.left);
                System.out.println(root.val);
                recDLR(root.right);
            }
        }

        // 堆栈
        private static void stackDLR(TreeNode root) {
            Stack<TreeNode> stack = new Stack();

            while (true) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                if (stack.isEmpty()) break;
                TreeNode pop = stack.pop();
                System.out.println(pop.val);
                root = pop.right;
            }
        }
    }

    // 层次遍历
    static class Level {

        public static void foreach(TreeNode root) {
            LinkedList<TreeNode> queueList = new LinkedList<>();
            queueList.push(root);
            while (!queueList.isEmpty()) {
                TreeNode pop = queueList.pop();
                if (pop != null) {
                    System.out.println(pop.val);
                    queueList.add(pop.left);
                    queueList.add(pop.right);
                }
            }
        }
    }
}