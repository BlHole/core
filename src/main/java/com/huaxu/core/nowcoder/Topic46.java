package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/23 12:55</p>
 * <p>author：huaxu</p>
 *
 * 把字符串转换成整数
 *
 * 题目描述
 *      将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 *
 * 输入描述:
 *      输入一个字符串,包括数字字母符号,可以为空
 * 输出描述:
 *      如果是合法的数值表达则返回该数字，否则返回0
 * 示例1
 *      输入
 *          +2147483647
 *          1a33
 *      输出
 *          2147483647
 *          0
 *
 * links: https://www.nowcoder.com/questionTerminal/1277c681251b4372bdef344468e4f26e
 */
public class Topic46 {

    public static void main(String[] args) {
        System.out.println(new Topic46().StrToInt("-2147483649"));
    }



    public int StrToInt(String str) {
        long res = 0;
        int i = 0, flag = 1;
        char[] array = str.toCharArray();
        if (array.length == 0) return 0;
        if (array[0] == '-') {
            flag = -1;
            i ++;
        } else if (array[0] == '+') {
            i ++;
        }
        for (; i < array.length; i ++) {
            if (array[i] >= '0' && array[i] <= '9') {
                int num = array[i] - '0';
                res = res * 10 + num;
                if (res * flag < Integer.MIN_VALUE) {
                    return 0;
                } else if (res * flag > Integer.MAX_VALUE) {
                    return 0;
                }
            } else return 0;
        }
        return (int)res * flag;
    }
}