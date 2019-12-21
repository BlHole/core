package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic104</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 19:31</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic104 {

    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}