package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/20 16:28</p>
 * <p>author：huaxu</p>
 *
 * 求1+2+3+...+n
 *
 * 题目描述
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * links: https://www.nowcoder.com/questionTerminal/59ac416b4b944300b617d4f7f111b215
 */
public class Topic45 {

    public int Add(int num1,int num2) {
        int num3;
        int num4;
        do{
            num3=num1^num2;
            num4=(num1&num2)<<1;
            num1=num3;
            num2=num4;
        }while(num4!=0);
        return (num1|num2);


    }
}