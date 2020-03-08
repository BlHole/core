package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/06 14:22</p>
 * <p>author：huaxu</p>
 */
public class Topic37 {


    public static void main(String[] args) {
        TreeNode deserialize = new Topic37().new Codec().deserialize("[1,2,3,null,null,4,5]");
        System.out.println(new Topic37().new Codec().serialize(deserialize));
    }




    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder("[");
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);

            int length = 1;
            while (!queue.isEmpty()) {
                TreeNode pop = queue.pollFirst();
                if (pop != null) {
                    sb.append(pop.val).append(",");
                    length = sb.toString().length();
                    queue.addLast(pop.left);
                    queue.addLast(pop.right);
                } else {
                    sb.append("null,");
                }
            }
            String res = sb.toString().substring(0, length > 1 ? length - 1 : length);
            return res + "]";
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            data = data.substring(1, data.length() - 1);
            if ("".equals(data) || data.length() == 0) {
                return null;
            }
            String[] arr = data.split(",");
            TreeNode root = new TreeNode(Integer.valueOf(arr[0]));
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);

            int i = 1;
            while (!queue.isEmpty() && i < arr.length) {
                TreeNode pop = queue.pollFirst();
                if ("null".equals(arr[i])) {
                    pop.left = null;
                }
                else {
                    pop.left = new TreeNode(Integer.valueOf(arr[i]));
                    queue.addLast(pop.left);
                }

                if (i + 1 >= arr.length) break;
                if ("null".equals(arr[i + 1])) {
                    pop.right = null;
                }
                else {
                    pop.right = new TreeNode(Integer.valueOf(arr[i + 1]));
                    queue.addLast(pop.right);
                }
                i += 2;
            }
            System.currentTimeMillis();
            return root;
        }
    }
}