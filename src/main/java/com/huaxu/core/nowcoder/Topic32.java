package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 14:24</p>
 * <p>author：huaxu</p>
 *
 * 第一个只出现一次的字符
 *
 * 题目描述
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 *
 * links: https://www.nowcoder.com/questionTerminal/1c82e8cf713b4bbeb2a5b31cf5b0417c
 */
public class Topic32 {

    public int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) return -1;
        int[] map = new int[123];// ASCII 65-122

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            map[aChar] ++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (map[chars[i]] == 1) return i;
        }
        return -1;
    }
}