package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.Arrays;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic23</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/15 23:08</p>
 * <p>创建用户：huaxu</p>
 */

public class Topic23 {


    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if (lists==null || lists.length==0) return null;
            if (lists.length==1) return lists[0];
            lists[lists.length-2] = mergeList(lists[lists.length-1], lists[lists.length-2]);
            return mergeKLists(Arrays.copyOf(lists, lists.length-1));
        }

        public ListNode mergeList(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            ListNode result = null;
            if (list1.val < list2.val) {
                result = new ListNode(list1.val);
                result.next = mergeList(list1.next, list2);
            } else {
                result = new ListNode(list2.val);
                result.next = mergeList(list1, list2.next);
            }
            return result;
        }
    }
}