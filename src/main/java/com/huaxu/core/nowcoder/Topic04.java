package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 14:39</p>
 * <p>author：huaxu</p>
 *
 * 重建二叉树
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 * links： https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Topic04 {

    class Solution {

        private Map<Integer, Integer> map = new HashMap<>();
        public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
            for (int i = 0; i < in.length; i++) {
                map.put(in[i], i);
            }
            return solution(pre, 0, pre.length - 1, 0, in.length - 1);
        }

        private TreeNode solution(int[] pre, int pr, int pl, int ir, int il) {
            if (pr > pl) return null;
            TreeNode root = new TreeNode(pre[pr]);
            int index = map.get(pre[pr]);
            root.left = solution(pre, pr + 1, pr + index - ir, ir, index - 1);
            root.right = solution(pre, pr + index - ir + 1, pl, index + 1, il);
            return root;
        }
    }
}