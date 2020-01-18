package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/18 14:04</p>
 * <p>author：huaxu</p>
 * <p>
 * 数组中出现次数超过一半的数字
 * <p>
 * 题目描述
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 * links: https://www.nowcoder.com/questionTerminal/e8a1b01a2df14cb2b228b30ee6a92163
 */
public class Topic28 {

    public static void main(String[] args) {
        System.out.println(new Topic28().MoreThanHalfNum_Solution(new int[]{2, 4, 5, 1, 1}));
    }

    public int MoreThanHalfNum_Solution(int[] array) {
        int count = 1;
        int num = array[0];

        for (int i = 1; i < array.length; i ++) {
            count = array[i] == num ? count + 1 : count - 1;
            if (count == 0) {
                num = array[i];
                count = 1;
            }
        }
        count = 0;
        for (int j = 0; j < array.length; j ++) {
            if (array[j] == num)
                count ++;
        }
        return count > array.length / 2 ? num : 0;
    }
}