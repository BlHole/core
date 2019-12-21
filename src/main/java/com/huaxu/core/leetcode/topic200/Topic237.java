package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic237</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 14:53</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic237 {

    public static void main(String[] args) {

    }

    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}