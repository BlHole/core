package com.huaxu.core.leetcode.type.sort;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/05 12:12</p>
 * <p>author：huaxu</p>
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int index, int length) {
        if (index >= length) return;
        int mid = index + (index + length) >> 1;
        sort(arr, index, mid);
        sort(arr, mid + 1, length);
        merge(arr, index, mid, length);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] copy = arr.clone();
        int k = low, i = low, j = mid + 1;
        while (k <= high) {
            if (i > mid) {
                arr[k ++] = copy[j ++];
            } else if (j > high) {
                arr[k ++] = copy[i ++];
            } else if (copy[j] > copy[i]) {
                arr[k ++] = copy[j ++];
            } else {
                arr[k ++] = copy[i ++];
            }
        }
    }
}