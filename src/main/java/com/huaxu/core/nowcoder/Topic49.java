package com.huaxu.core.nowcoder;

import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/25 16:01</p>
 * <p>author：huaxu</p>
 *
 * 正则表达式匹配
 *
 * 题目描述
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 *
 * links:
 */
public class Topic49 {

    public boolean match(char[] str, char[] pattern) {

        boolean[] map = new boolean[pattern.length];
        return dfs(str, pattern, map, 0);
    }

    private boolean dfs(char[] str, char[] pattern, boolean[] map, int index) {
        if (index == str.length) return true;
        for (int i = 0; i < str.length; i++) {
            if (pattern[i] == '.') continue;
            else if (pattern[i] == '*') {

            } else if (str[i] == pattern[i] && !map[i]) {
                map[i] = true;
                dfs(str, pattern, map, index++);
                map[i] = false;
            }
        }
    }
}