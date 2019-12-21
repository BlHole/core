package com.huaxu.core.leetcode.topic100;

import java.util.Arrays;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic155</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 18:52</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic155_2 {

    class MinStack {

        private int index = 0;
        private int count = 10;
        private Integer[] data;

        /** initialize your data structure here. */
        public MinStack() {
            data = new Integer[count];
        }

        public void push(int x) {
            data[index++] = x;
            addCount();
        }

        private void addCount(){
            if (index == count) {
                data = Arrays.copyOf(data, count<<=1);
            }
        }

        public void pop() {
            data[--index] = null;
        }

        public int top() {
            return data[index-1];
        }

        public int getMin() {
            int temp = Integer.MAX_VALUE;
            for (int i = 0; i < index; i++) {
                if (data[i] != null) {
                    temp = Math.min(data[i], temp);
                }
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new Topic155_2().new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}