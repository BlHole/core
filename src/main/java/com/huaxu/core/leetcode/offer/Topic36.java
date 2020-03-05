package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 11:37</p>
 * <p>author：huaxu</p>
 */
public class Topic36 {

    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    class Solution {
        Node pre = null;

        public Node treeToDoublyList(Node root) {
            if (root == null) return root;
            Node p = root, q = root;
            while (p.left != null) p = p.left;
            while (q.right != null) q = q.right;
            inorder(root);
            p.left = q;
            q.right = p;
            return p;
        }

        private void inorder(Node root) {
            if (root != null) {
                inorder(root.left);

                root.left = pre;
                if (pre != null) {
                    pre.right = root;
                }
                pre = root;
                inorder(root.right);
            }
        }
    }
}