package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 17:31</p>
 * <p>author：huaxu</p>
 *
 *
 * 调整数组位置使奇数位于偶数前面
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * links: https://www.nowcoder.com/questionTerminal/beb5aa231adc45b2a5dcc5b62c93f593
 */
public class Topic13 {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        reOrderArray(ints);
        System.out.println(ints);
    }

    static public void reOrderArray(int[] array) {
        int low = 0, fast = 0, length = array.length;
        while (fast < length && low < length) {
            while (fast < length && (array[fast] & 1) == 0) fast ++;
            if (fast == length) return;
            int temp = array[fast], limit = fast - low;
            while (limit > 0) {
                array[low + limit] = array[low + limit - 1];
                limit --;
            }
            array[low ++] = temp;
            fast ++;
        }
    }
}