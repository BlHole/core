package com.huaxu.core.diy.dynamicGenerateClass;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/05 20:53</p>
 * <p>author：huaxu</p>
 */
public class QuickSort {

    public static void main(String[] args) {
//        int[] sort = new QuickSort().sort(new int[]{4, 3, 2, 1, 0}, 0, 4);
        int[] sort = new QuickSort().sort(new int[]{0, 1, 2, 3, 4}, 0, 4);
        for (int i : sort) {
            System.out.println(i);
        }
    }

    public int[] sort(int[] arr, int start, int end) {
        if (arr.length <= 1 || start >= end) {
            return arr;
        }
        int base = arr[start], left = start, right = end;
        while (left < right) {
            while (arr[right] > base && left < right) { right--;}
            arr[left] = arr[right];
            while (arr[left] < base && left < right) { left++;}
            arr[right] = arr[left];
        }
        arr[left] = base;
        sort(arr, start, left - 1);
        sort(arr, left + 1, end);
        return arr;
    }
}