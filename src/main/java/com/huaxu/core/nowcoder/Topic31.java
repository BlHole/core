package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 11:31</p>
 * <p>author：huaxu</p>
 * <p>
 * 丑数
 *
 * 题目描述
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，
 * 因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *
 * links: https://www.nowcoder.com/questionTerminal/6aa9e04fc3794f68acf8778237ba065b
 */
public class Topic31 {

    public int GetUglyNumber_Solution(int index) {
        if (index <= 6) return index;
        int[] dp = new int[index];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < index; i ++) {
            int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
            dp[i] = Math.min(next2, Math.min(next3, next5));
            i2 = next2 == dp[i] ? i2 + 1 : i2;
            i3 = next3 == dp[i] ? i3 + 1 : i3;
            i5 = next5 == dp[i] ? i5 + 1 : i5;
        }
        return dp[index - 1];
    }
}