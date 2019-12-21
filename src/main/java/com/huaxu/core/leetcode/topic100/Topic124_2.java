package com.huaxu.core.leetcode.topic100;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic124_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/03 20:57</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic124_2 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-5);
        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(1);
//        root.left.left.left = new TreeNode(-1);
//        root.left.right = new TreeNode(3);

        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(-2);

        int a = new Topic124_2().new Solution().maxPathSum(root);
        System.out.println(a);
    }

    class Solution {
        private int ret = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            getMax(root);
            return ret;
        }

        private int getMax(TreeNode r) {
            if(r == null) return 0;
            int left = Math.max(0, getMax(r.left)); // 如果子树路径和为负则应当置0表示最大路径不包含子树
            int right = Math.max(0, getMax(r.right));
            ret = Math.max(ret, r.val + left + right); // 判断在该节点包含左右子树的路径和是否大于当前最大路径和
            return Math.max(left, right) + r.val;
        }
    }
}