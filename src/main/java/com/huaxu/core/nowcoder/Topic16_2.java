package com.huaxu.core.nowcoder;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 18:42</p>
 * <p>author：huaxu</p>
 */
public class Topic16_2 {

    static public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode res = new ListNode(0), index = res;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                index.next = list1;
                list1 = list1.next;
            } else  {
                index.next = list2;
                list2 = list2.next;
            }
            index = index.next;
        }
        if (list1 == null) index.next = list2;
        if (list2 == null) index.next = list1;
        return res.next;
    }
}