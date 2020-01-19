package com.huaxu.core.nowcoder;


import java.util.HashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 18:54</p>
 * <p>author：huaxu</p>
 *
 * 数组中只出现一次的数字
 *
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 *
 */
public class Topic38 {

    public void FindNumsAppearOnce(int[] array, int num1[] ,int num2[]) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        Integer[] arr = new Integer[2];
        arr = set.toArray(arr);
        num1[0] = arr[0];
        num2[0] = arr[1];
    }
}