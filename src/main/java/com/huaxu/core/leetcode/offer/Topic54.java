package com.huaxu.core.leetcode.offer;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 17:50</p>
 * <p>author：huaxu</p>
 */
public class Topic54 {

    class Solution {

        public int kthLargest(TreeNode root, int k) {
            List<Integer> res = new ArrayList<>();
            solution(root, res);
            return res.get(res.size() - k);
        }

        private void solution(TreeNode root, List<Integer> res) {
            if (root != null) {
                solution(root.left, res);
                res.add(root.val);
                solution(root.right, res);
            }
        }
    }
}