package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 14:40</p>
 * <p>author：huaxu</p>
 *
 * 数组中的逆序对
 *
 * 题目描述
 *      在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 *
 * 输入描述:
 *      题目保证输入的数组中没有的相同的数字
 *
 * 数据范围：
 *
 * 	对于%50的数据,size<=10^4
 * 	对于%75的数据,size<=10^5
 * 	对于%100的数据,size<=2*10^5
 *
 * 示例1
 *      输入  1,2,3,4,5,6,7,0
 *      输出  7
 *
 * links: https://www.nowcoder.com/questionTerminal/96bd6684e04a44eb80e6a68efc0ec6c5
 */
public class Topic33 {

    private int cnt;

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) return 0;
        mergeSort(array, 0, array.length - 1);
        return cnt;
    }

    private void mergeSort(int[] array, int lo, int hi) {
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            mergeSort(array, lo, mid);
            mergeSort(array, mid + 1, hi);
            mergeArr(array, lo, mid, hi);
        }
    }

    private void mergeArr(int[] array, int lo, int mid, int hi) {
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
                cnt = (cnt + (mid - left + 1)) % 1000000007;
                copy[index ++] = array[right ++];
            }
        }
        for (int i = 0; i < length; i++) {
            array[i + lo] = copy[i];
        }
    }
}