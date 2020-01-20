package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/20 14:41</p>
 * <p>author：huaxu</p>
 *
 * 左旋转字符串
 *
 * 题目描述
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，
 * 就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，
 * 请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 *
 * links: https://www.nowcoder.com/questionTerminal/12d959b108cb42b1ab72cef4d36af5ec
 */
public class Topic41 {

    public static void main(String[] args) {
        String abcXYZdef = new Topic41().LeftRotateString("abcXYZdef", 3);
        System.out.println(abcXYZdef);
    }


    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() < 2) return str;
        n = n % str.length();

        char[] chars = str.toCharArray();
        for (int i = 0, j; i < n; i++) {
            char temp = chars[0];
            for (j = 1; j < str.length(); j++) {
                chars[j - 1] = chars[j];
            }
            chars[j - 1] = temp;
        }
        return new String(chars);
    }
}