package com.huaxu.core.leetcode.type.sort;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 11:52</p>
 * <p>author：huaxu</p>
 */
public class BubbeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int index, int length) {
        for (int i = index; i <= length; i++) {
            for (int j = i + 1; j <= length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}