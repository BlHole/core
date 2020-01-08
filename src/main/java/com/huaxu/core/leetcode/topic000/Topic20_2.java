package com.huaxu.core.leetcode.topic000;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 10:14</p>
 * <p>author：huaxu</p>
 */
public class Topic20_2 {

    public static void main(String[] args) {
        boolean valid = new Topic20_2().new Solution().isValid("{[]}");
        System.out.println(valid);
    }

    class Solution {
        Map<String,String> map;

        public Solution() {
            map = new HashMap();
            map.put("(", ")");
            map.put(")", "(");
            map.put("{", "}");
            map.put("}", "{");
            map.put("[", "]");
            map.put("]", "[");
        }

        public boolean isValid(String s) {
            Stack<String> stack = new Stack();
            for (int i = 0; i < s.length(); i ++) {
                if (!stack.isEmpty() && map.get(String.valueOf(s.charAt(i))).equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
            return stack.isEmpty();
        }
    }
}