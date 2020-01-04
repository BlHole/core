package com.huaxu.core.leetcode.type.sort;

import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/13 10:51</p>
 * <p>author：huaxu</p>
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int length) {
        if (arr == null || length < 2) return;
        for (int i = (length >> 1) + 1; i >= start; i --) {
            buildHead(arr, i, length);
        }
        for (int i = length - 1; i > 0; i --) {
            swap(arr, 0, i);
            buildHead(arr, 0, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void buildHead(int[] arr, int index, int length) {
        int base = arr[index];
        for (int i = getLeftChildNodeIndex(index); i < length; i = getLeftChildNodeIndex(i)) {
            if (i + 1 < length && arr[i] < arr[i+1]) i++;
            if (base > arr[i]) break;
            arr[index] = arr[i];
            index = i;
        }
        arr[index] = base;
    }

    private static int getLeftChildNodeIndex(int index) {
        return (index << 1) + 1;
    }
}