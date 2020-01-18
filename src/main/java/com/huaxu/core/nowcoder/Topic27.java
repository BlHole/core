package com.huaxu.core.nowcoder;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/18 11:06</p>
 * <p>author：huaxu</p>
 *
 * 字符串的排列
 *
 *
 * 题目描述
 *      输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 * 输入描述:
 *      输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 *
 * links: https://www.nowcoder.com/questionTerminal/fe6b651b66ae47d7acce78ffdd9a96c7
 */
public class Topic27 {

    public static void main(String[] args) {
        ArrayList<String> acdb = new Topic27().Permutation("abc");
        acdb.forEach(System.out::println);
    }

    private TreeSet<String> res = new TreeSet<>();

    public ArrayList<String> Permutation(String str) {
        if (str != null && str.length() > 0) {
            char[] arr = str.toCharArray();
            dfs(arr, 0, arr.length);
        }
        return new ArrayList<>(res);
    }

    private void dfs(char[] arr, int start, int end) {
        if (start == end - 1) {
            res.add(new String(arr));
            return;
        }

        for (int i = start; i < end; i ++) {
            swap(arr, start, i);
            dfs(arr, start + 1, end);
            swap(arr, start, i);
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}