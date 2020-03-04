package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 17:11</p>
 * <p>author：huaxu</p>
 */
public class Topic32_2 {

    class Solution {

        class YNode {
            private int h;
            private TreeNode node;

            public YNode(int h, TreeNode node) {
                this.h = h;
                this.node = node;
            }
        }

        private List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> levelOrder(TreeNode root) {
            LinkedList<YNode> queue = new LinkedList<>();
            queue.addLast(new YNode(0, root));

            while (!queue.isEmpty()) {
                YNode yNode = queue.pollFirst();
                if (yNode.node != null) {
                    if (res.size() <= yNode.h) {
                        res.add(new ArrayList<>());
                    }
                    res.get(yNode.h).add(yNode.node.val);
                    queue.addLast(new YNode(yNode.h + 1, yNode.node.left));
                    queue.addLast(new YNode(yNode.h + 1, yNode.node.right));
                }
            }
            return res;
        }
    }
}