package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/17 16:15</p>
 * <p>author：huaxu</p>
 *
 * 复杂链表的复制
 *
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 * links: https://www.nowcoder.com/questionTerminal/f836b2c43afc4b35ad6adc41ec941dba
 */
public class Topic25 {

    class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode res = new RandomListNode(pHead.label), head = res;
        if (pHead.random != null) {
            head.random = new RandomListNode(pHead.random.label);
        }
        while (pHead.next != null) {
            pHead = pHead.next;
            head.next = new RandomListNode(pHead.label);
            if (pHead.random != null) {
                head.next.random = new RandomListNode(pHead.random.label);
            }
            head = head.next;
        }
        return res;
    }
}