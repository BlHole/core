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
        int i = 0, j = 0, lStr = str.length, pStr= pattern.length;
        while (i < lStr && j < pStr) {
            if ('.' == pattern[j] || str[i] == pattern[j]) {
                i ++; j++;
                continue;
            }
            if (str[i] != pattern[j] && j + 1 < pStr) {

            }

        }
        return i == lStr && j == pStr;
    }
}