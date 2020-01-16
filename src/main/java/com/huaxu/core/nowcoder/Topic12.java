package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 17:24</p>
 * <p>author：huaxu</p>
 *
 * 数值的整数次方
 *
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 *
 * links: https://www.nowcoder.com/questionTerminal/1a834e5e3e1a4b7ba251417554e07c00
 */
public class Topic12 {

    public static double Power(double base, int exponent) {
        if (exponent == 0) return 1;
        double res = 1.0;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i ++) {
                res = res * base;
            }
            return res;
        }
        for (int i = 0; i < -exponent; i ++) {
            res = res * base;
        }
        return 1/res;
    }
}