package com.huaxu.core.nowcoder;

import java.util.Iterator;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/17 09:40</p>
 * <p>author：huaxu</p>
 *
 * 包含min函数的栈
 *
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 *
 * links: https://www.nowcoder.com/questionTerminal/4c776177d2c04c2494f2555c9fcc1e49
 */
public class Topic20 {

    public class Solution {

        Stack<Integer> stack = new Stack<Integer>();
        public void push(int node) {
            stack.push(node);
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int min() {
            int min = stack.peek();
            int tmp = 0;
            Iterator<Integer> iterator = stack.iterator();
            while (iterator.hasNext()){
                tmp = iterator.next();
                if (min>tmp){
                    min = tmp;
                }
            }
            return min;
        }
    }
}