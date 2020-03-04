package com.huaxu.core.leetcode.type.binTree;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 14:05</p>
 * <p>author：huaxu</p>
 */
public class Test {

    /**
     *      1
     *     /  \
     *    2   3
     *   / \ / \
     *  4  5 6  7
     */

    public static void main(String[] args) {
        Integer[] cols = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Houxu.newDDD(BinTreeBuild.buildTree(cols, 0));
    }

    static class XianXu {
        public static void xianxu(TreeNode node){
            if (node != null) {
                System.out.println(node.val);
                xianxu(node.left);
                xianxu(node.right);
            }
        }

        public static void duizhan(TreeNode node) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(node);

            while (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                if (pop != null) {
                    System.out.println(pop.val);
                    stack.add(pop.right);
                    stack.add(pop.left);
                }
            }
        }

        public static void duilie(TreeNode node) {
            LinkedList<TreeNode> list = new LinkedList<>();
            list.addLast(node);

            while (!list.isEmpty()) {
                TreeNode treeNode = list.pollLast();
                if (treeNode != null) {
                    System.out.println(treeNode.val);
                    list.addLast(treeNode.right);
                    list.addLast(treeNode.left);
                }
            }
        }

        public static void newLef(TreeNode node) {
            Stack<TreeNode> stack = new Stack<>();
            while (true) {
                while (node != null) {
                    System.out.println(node.val);
                    stack.add(node.right);
                    node = node.left;
                }
                if (stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
            }
        }
    }

    static class Zhongxu {
        public static void digui(TreeNode node) {
            if (node != null) {
                digui(node.left);
                System.out.print(node.val);
                digui(node.right);
            }
        }

        public static void duizhan(TreeNode node) {
            Stack<TreeNode> stack = new Stack<>();
            while (true) {
                while (node != null) {
                    stack.add(node);
                    node = node.left;
                }
                if (stack.isEmpty()) break;
                TreeNode pop = stack.pop();
                System.out.print(pop.val);
                node = pop.right;
            }
        }
    }

    static class Houxu {
        public static void digui(TreeNode node) {
            if (node != null) {
                digui(node.left);
                digui(node.right);
                System.out.println(node.val);
            }
        }

        public static void newDDD(TreeNode biTree) {
            int left = 1;//在辅助栈里表示左节点
            int right = 2;//在辅助栈里表示右节点
            Stack<TreeNode> stack = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();//辅助栈，用来判断子节点返回父节点时处于左节点还是右节点。

            while (biTree != null || !stack.empty()) {
                while (biTree != null) {
                    stack.push(biTree);
                    stack2.push(left);
                    biTree = biTree.left;
                }

                while (!stack.empty() && stack2.peek() == right) {
                    stack2.pop();
                    System.out.println(stack.pop().val);
                }

                if (!stack.empty() && stack2.peek() == left) {
                    stack2.pop();
                    stack2.push(right);
                    biTree = stack.peek().right;
                }
            }
        }
    }
}