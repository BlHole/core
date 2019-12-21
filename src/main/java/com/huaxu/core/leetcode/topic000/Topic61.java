package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic61</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/09/29 13:58</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic61 {

    public static void main(String[] args) {
        ListNode s1 = new ListNode(1);
        ListNode s2 = new ListNode(2);
        ListNode s3 = new ListNode(3);
        ListNode s4 = new ListNode(4);
        ListNode s5 = new ListNode(5);
        s1.next = s2;
        s2.next = s3;
        s3.next = s4;
        s4.next = s5;

        ListNode node = new Solution().rotateRight(s1, 0);
        System.out.println();
    }

    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null) return head;
            if (head.next == null) return head;
            int size = 1;
            // build ring
            ListNode nodeLast = head;
            while (nodeLast.next!=null) {
                nodeLast = nodeLast.next;
                size++;
            }
            nodeLast.next = head;

            // cutting
            k = size-k%size;
            while (k-->0){
                nodeLast = head;
                head = head.next;
            }
            nodeLast.next = null;
            return head;
        }
    }
}