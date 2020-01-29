package com.huaxu.core.nowcoder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/29 09:39</p>
 * <p>author：huaxu</p>
 *
 * 字符流中第一个不重复的字符
 *
 * 题目描述
 *      请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
 *      第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 *
 * 输出描述:
 *      如果当前字符流没有存在出现一次的字符，返回#字符。
 *
 * links: https://www.nowcoder.com/questionTerminal/00de97733b8e4f97a3fb5c680ee10720
 */
public class Topic51 {

    private LinkedList<Character> queue = new LinkedList<>();
    private Set<Character> set = new HashSet<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (set.contains(ch)) {
            for (int i = 0; i < queue.size(); i++) {
                if (queue.get(i) == ch) {
                    queue.remove(i);
                }
            }

        } else {
            queue.addLast(ch);
            set.add(ch);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peekFirst();
    }
}