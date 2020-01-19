package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 17:56</p>
 * <p>author：huaxu</p>
 */
public class Topic36_2 {

    public int TreeDepTh(TreeNode root) {
        if (root == null) return 0;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int res = 0, count = 0, nextLowCount = 1;
        while (!queue.isEmpty()) {
            TreeNode pop = queue.pollFirst();
            count ++;
            if (pop.left != null) {
                queue.addLast(pop.left);
            }
            if (pop.right != null) {
                queue.addLast(pop.right);
            }
            if (count == nextLowCount) {
                nextLowCount = queue.size();
                count = 0;
                res ++;
            }
        }
        return res;
    }
}