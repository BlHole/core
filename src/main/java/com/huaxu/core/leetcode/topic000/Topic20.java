package com.huaxu.core.leetcode.topic000;

import java.util.Stack;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic1</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 09:38</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic20 {

    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack();
            for (int i=0,length=s.length(); i<length; i++) {
                if (!stack.empty() && checkChar(stack.peek(),s.charAt(i)))
                    stack.pop();
                else
                    stack.add(s.charAt(i));
            }
            return stack.empty();
        }

        private boolean checkChar(Character peek, char c) {
            if (peek == '(' && c == ')')
                return true;
            else if (peek == '{' && c == '}')
                return true;
            else if (peek == '[' && c == ']')
                return true;
            return false;
        }
    }
}