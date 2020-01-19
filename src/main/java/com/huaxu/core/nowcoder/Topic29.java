package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 10:23</p>
 * <p>author：huaxu</p>
 *
 * 整数中一出现的次数
 *
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 *
 * links: https://www.nowcoder.com/questionTerminal/bd7f978302044eee894445e244c7eee6
 */
public class Topic29 {

    public int NumberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getOneCount(i);
        }
        return sum;

    }

    private int getOneCount(int n) {
        int count = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') count++;
        }
        return count;
    }
}