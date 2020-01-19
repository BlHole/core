package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 19:09</p>
 * <p>author：huaxu</p>
 *
 * Links: https://www.nowcoder.com/questionTerminal/e02fdb54d7524710a7d664d082bb7811
 */
public class Topic38_2 {

    public void FindNumsAppearOnce(int[] array, int num1[] ,int num2[]) {
        int xorNum = 0;
        for(int i = 0; i < array.length; i++) {
            xorNum ^= array[i];
        }
        int temp = 1;
        while((temp & xorNum) == 0)
            temp = temp << 1;

        int xorNum1 = 0;
        for(int i = 0; i < array.length; i++) {
            if((temp & array[i]) != 0) xorNum1 ^= array[i];
        }
        num1[0] = xorNum1;
        num2[0] = xorNum1^xorNum;
    }
}