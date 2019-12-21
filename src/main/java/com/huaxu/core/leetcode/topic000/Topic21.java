package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 09:38</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic21 {


    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;

            ListNode listNode = null;
            if (l1.val < l2.val) {
                listNode = new ListNode(l1.val);
                listNode.next = mergeTwoLists(l1.next, l2);
            } else {
                listNode = new ListNode(l2.val);
                listNode.next = mergeTwoLists(l1, l2.next);
            }
            return listNode;
        }
    }
}