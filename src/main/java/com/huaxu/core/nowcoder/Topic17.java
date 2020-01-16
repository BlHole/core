package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 18:46</p>
 * <p>author：huaxu</p>
 *
 * 树的子结构
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 * links: https://www.nowcoder.com/questionTerminal/6e196c44c7004d15b1610b9afca8bd88
 */
public class Topic17 {

    public static void main(String[] args) {
        TreeNode treeNodeA = TreeNode.buildTree(new Integer[]{8, 8, 7, 9, 2, null, null, null, null, 4, 7});
        TreeNode treeNodeB = TreeNode.buildTree(new Integer[]{8, 9, 2});
        System.out.println(new Topic17().HasSubtree(treeNodeA, treeNodeB));
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null || root1 == null) return false;
        return solution(root1, root2);
    }

    private boolean solution(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null) return false;
        if (root2 == null) return true;
        if (root1.val != root2.val) {
            return solution(root1.left, root2) || solution(root1.right, root2);
        }
        if (solution(root1.left, root2.left) && solution(root1.right, root2.right)) {
            return true;
        }
        return solution(root1.left, root2) || solution(root1.right, root2);
    }
}