package com.huaxu.core.leetcode.type.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/08 19:11</p>
 * <p>author：huaxu</p>
 */
public class HeapPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>( new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }
}