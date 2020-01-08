package com.huaxu.core.leetcode.type.sort;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 11:59</p>
 * <p>author：huaxu</p>
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int index, int length) {
        for (int i = index + 1, j, curr; i <= length; i++) {
            curr = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > curr; j --) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = curr;
        }
    }
}