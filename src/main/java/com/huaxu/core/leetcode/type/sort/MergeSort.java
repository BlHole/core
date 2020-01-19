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
        merge(arr, arr.clone(), lo, mid, hi);
    }

    /**
     *  @Date: 3:27 PM 2020/1/19
     *
     *  left = 左半边的开始值
     *  right = 右半边的开始值
     *
     *  index = 每次得到的值的游标
     */
    private static void merge(int[] arr, int[] copy, int lo, int mid, int hi) {
        int index = lo, left = lo, right = mid + 1;

        while (index <= hi) {
            if (left > mid) {
                arr[index ++] = copy[right ++];

            } else if (right > hi) {
                arr[index ++] = copy[left ++];

            } else if (copy[left] < copy[right]) {
                arr[index ++] = copy[left ++];

            } else {
                arr[index ++] = copy[right ++];
            }
        }
    }
}