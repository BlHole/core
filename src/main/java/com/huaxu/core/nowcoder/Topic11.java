package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 17:02</p>
 * <p>author：huaxu</p>
 *
 * 二进制中的1
 *
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * links: https://www.nowcoder.com/questionTerminal/8ee967e43c2c4ec193b040ea7fbb10b8
 */
public class Topic11 {

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count ++;
            n = n & (n - 1);
        }
        return count;
    }
}