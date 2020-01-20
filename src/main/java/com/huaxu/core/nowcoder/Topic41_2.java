package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/20 14:57</p>
 * <p>author：huaxu</p>
 */
public class Topic41_2 {

    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() < 2) return str;
        n = n % str.length();

        char[] prev = new char[n], move = new char[str.length() - n];
        char[] arr = str.toCharArray();
        for (int i = 0, length = str.length(); i < length; i++) {
            if (i < n) {
                prev[i] = arr[i];
            } else {
                move[i - n] = arr[i];
            }
        }
        return new String(move) + new String(prev);
    }
}