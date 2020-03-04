package com.huaxu.core.leetcode.offer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/04 11:01</p>
 * <p>author：huaxu</p>
 *
 * max_value、push_back 和 pop_front 的时间复杂度都是O(1)。
 *
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 */
public class Topic59_2 {

    class MaxQueue {

        private LinkedList<Integer> queue = new LinkedList<>();
        private LinkedList<Integer> queueMax = new LinkedList<>();

        public MaxQueue() {
        }

        public int max_value() {
            return queueMax.isEmpty() ? -1 : queueMax.peekFirst();
        }

        public void push_back(int value) {
            queue.addLast(value);

            while (!queueMax.isEmpty() && value > queueMax.peekLast()) {
                queueMax.pollLast();
            }
            queueMax.addLast(value);
        }

        public int pop_front() {
            if (queue.isEmpty()) {
                return -1;
            }
            int ans = queue.pollFirst();
            if (ans == queueMax.peekFirst()) {
                queueMax.pollFirst();
            }
            return ans;
        }
    }

}