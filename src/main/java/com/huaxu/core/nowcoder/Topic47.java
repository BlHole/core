package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/23 13:55</p>
 * <p>author：huaxu</p>
 *
 * 数组中重复的数字
 *
 * 题目描述
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，
 * 那么对应的输出是第一个重复的数字2。
 *
 * links: https://www.nowcoder.com/questionTerminal/623a5ac0ea5b4e5f95552655361ae0a8
 */
public class Topic47 {

    public boolean duplicate(int[] numbers, int length, int[] duplication) {
        if (length < 2) return false;

        int[] clone = numbers.clone();
        for (int i = 0; i < length; i++) {
            if (clone[numbers[i]] == -1) {
                duplication[0] = numbers[i];
                return true;
            }
            clone[numbers[i]] = -1;
        }
        return false;
    }
}