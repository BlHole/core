package com.huaxu.core;

import com.huaxu.core.leetcode.basic.ListNode;
import com.huaxu.core.leetcode.basic.TreeNode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/12 17:18</p>
 * <p>author：huaxu</p>
 */
public class TestTreeNode {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t3.left = t2;
        t2.left = t1;
        t3.right = t4;
        t4.left = t5;
        t4.right = t6;


        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(2, (Integer a, Integer b) -> a - b);
        queue.offer(6);
        queue.offer(5);
        queue.offer(4);
        queue.offer(2);
        queue.offer(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        PriorityQueue<Integer> queue22 = new PriorityQueue<>(3, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        PriorityQueue<Integer> queue1 = new PriorityQueue<>(3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    public void isUnivalTree(TreeNode root) {
        if (root != null) {
            isUnivalTree(root.left);
            System.out.println(root.val);
            isUnivalTree(root.right);
        }
    }


    public ListNode mergeKLists(ListNode[] lists) {
        //利用一个空的链表头方便插入节点。
        ListNode fakeHead = new ListNode(0), p = fakeHead;
        int k = lists.length;

        // 定义一个最小堆来保存 k 个链表节点；将 k 个链表的头放入到最小堆里。
        PriorityQueue<ListNode> heap = new PriorityQueue<>(
                k, new Comparator<ListNode>() {
                    public int compare(ListNode a, ListNode b) {
                        return a.val - b.val;
                    }
                });

        // 从最小堆里将当前最小的节点取出，插入到结果链表中。
        for (int i = 0; i < k; i++) {
            if (lists[i] != null) {
                heap.offer(lists[i]);
            }
        }

        while (!heap.isEmpty()) {
            ListNode node = heap.poll();

            p.next = node;
            p = p.next;

            // 如果发现该节点后面还有后续节点，将后续节点加入到最小堆里。
            if (node.next != null) {
                heap.offer(node.next);
            }
        }
        return fakeHead.next;

    }
}