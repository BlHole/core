package com.huaxu.core.tj;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/13 11:18</p>
 * <p>author：huaxu</p>
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int end) {
        if (arr == null || start >= end || end <= 1) return;
        int left = start, right = end, base = arr[left];
        while (left < right) {
            while (base <= arr[right] && left < right) right --;
            arr[left] = arr[right];
            while (base > arr[left] && left < right) left ++;
            arr[right] = arr[left];
        }
        arr[left] = base;
        sort(arr, start, left - 1);
        sort(arr, left + 1, end);
    }
}