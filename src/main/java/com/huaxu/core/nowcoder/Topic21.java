package com.huaxu.core.nowcoder;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/17 09:41</p>
 * <p>author：huaxu</p>
 *
 * 栈的压入，弹出序列
 *
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 *
 * links: https://www.nowcoder.com/questionTerminal/d77d11405cc7470d82554cb392585106
 */
public class Topic21 {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0) return false;

        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int itme : pushA) {
            stack.push(itme);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index ++;
            }
        }
        return stack.isEmpty();
    }

    static int[] in = {1, 2, 3, 4};

    public static void main(String[] args) {
        fun(0,new Stack<>(),"");
    }

    /**
     *  给定一个压入栈的顺序， 获取所有出栈的结果
     */
    static void fun(int n, Stack<Integer> stk, String sout) {
        if(n == in.length && stk.isEmpty()){
            System.out.println(sout);
            return;
        }
        Stack<Integer> s1 = (Stack<Integer>) stk.clone();
        Stack<Integer> s2 = (Stack<Integer>) stk.clone();
        if (n < in.length) {
            s1.push(in[n]);
            fun(n + 1, s1, sout);
        }
        if (!s2.isEmpty()) {
            String temp = sout + s2.peek();
            s2.pop();
            fun(n, s2, temp);
        }
    }
}