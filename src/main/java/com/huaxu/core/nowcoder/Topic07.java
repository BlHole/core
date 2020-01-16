package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 15:31</p>
 * <p>author：huaxu</p>
 *
 * 斐波那契数列
 *
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 *
 * links: https://www.nowcoder.com/questionTerminal/c6c7742f5ba7442aada113136ddea0c3
 */
public class Topic07 {

    public int Fibonacci(int n) {
        if (n == 0) return n;
        if (n < 3) return 1;
        int a = 1, b = 1;
        for (int i = 3; i <= n; i ++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }
}