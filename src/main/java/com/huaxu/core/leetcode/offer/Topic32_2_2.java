package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 17:43</p>
 * <p>author：huaxu</p>
 */
public class Topic32_2_2 {

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> ret = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {

                List<Integer> list = new ArrayList<>();
                int cnt = queue.size();
                while (cnt-- > 0) {
                    TreeNode poll = queue.poll();
                    if (poll != null) {
                        list.add(poll.val);
                        queue.add(poll.left);
                        queue.add(poll.right);
                    }
                }
                if (!list.isEmpty()) {
                    ret.add(list);
                }
            }
            return ret;
        }
    }
}