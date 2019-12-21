package com.huaxu.core.leetcode.topic100;

import java.util.Stack;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic155_3</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 21:09</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic155_3 {

    public static void main(String[] args) {
        MinStack minStack = new Topic155_3().new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);

        minStack.pop();
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.min);
    }


    class MinStack {
        /** initialize your data structure here. */
        private Integer min;
        private Stack<Integer> data;

        public MinStack() {
            min = Integer.MAX_VALUE;
            data = new Stack<>();
        }

        public void push(int x) {
            if (x <= min) {
                data.push(min);
                min = x;
            }
            data.push(x);
        }

        public void pop() {
            if (data.pop().equals(min)) {
                min = data.pop();
            }
        }

        public int top() {
            return data.peek();
        }

        public int getMin() {
            return min;
        }
    }
}