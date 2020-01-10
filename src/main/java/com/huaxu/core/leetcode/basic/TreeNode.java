package com.huaxu.core.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: basic.TreeNode</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 19:30</p>
 * <p>创建用户：huaxu</p>
 */
public class TreeNode {
    public Integer val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(Integer x) { val = x; }


    public static TreeNode buildTree(Integer[] inputs) {
        if (inputs == null || inputs.length == 0) return null;

        List<TreeNode> nodeList = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            nodeList.add(new TreeNode(inputs[i]));
        }

        int temp = 0;
        while(temp <= inputs.length / 2) {
            if (2 * temp + 1 < inputs.length) {
                nodeList.get(temp).left = nodeList.get(2 * temp + 1);
            }
            if (2 * temp + 2 < inputs.length) {
                nodeList.get(temp).right = nodeList.get(2 * temp + 2);
            }
            temp ++;
        }
        return nodeList.get(0);
    }
}