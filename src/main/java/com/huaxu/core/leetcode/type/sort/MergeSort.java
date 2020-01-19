package com.huaxu.core.leetcode.type.sort;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 15:21</p>
 * <p>author：huaxu</p>
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int lo, int hi) {
        if (lo == hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);
        sort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }

    /**
     *  @Date: 3:27 PM 2020/1/19
     *
     *  left = 左半边的开始值
     *  right = 右半边的开始值
     *
     *  index = 每次得到的值的游标
     */
    private static void merge(int[] array, int lo, int mid, int hi) {
        int index = 0, left = lo, right = mid + 1;
        int length = hi - lo + 1;
        int[] copy = new int[length];

        while (index < length) {
            if (left > mid) {
                copy[index ++] = array[right ++];

            } else if (right > hi) {
                copy[index ++] = array[left ++];

            } else if (array[left] <= array[right]) {
                copy[index ++] = array[left ++];

            } else {
                copy[index ++] = array[right ++];
            }
        }
        for (int i = 0; i < length; i++) {
            array[i + lo] = copy[i];
        }
    }
}