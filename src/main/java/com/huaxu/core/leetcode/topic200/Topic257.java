package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/25 21:14</p>
 * <p>author：huaxu</p>
 */
public class Topic257 {

    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new ArrayList<>();
            solution(root, "", res);
            return res;
        }

        private void solution(TreeNode root, String path, List<String> res) {
            if (root != null) {
                path += root.val;
                if (root.left == null && root.right == null) {
                    res.add(path);
                } else {
                    path += "->";
                    solution(root.left, path, res);
                    solution(root.right, path, res);
                }
            }
        }
    }

}