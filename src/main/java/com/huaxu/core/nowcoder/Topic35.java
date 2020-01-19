package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 17:10</p>
 * <p>author：huaxu</p>
 *
 *
 * 数字在排序数组中出现的次数
 *
 * 题目描述
 * 统计一个数字在排序数组中出现的次数。
 *
 * links: https://www.nowcoder.com/questionTerminal/70610bf967994b22bb1c26f9ae901fa2
 */
public class Topic35 {

    public static void main(String[] args) {
        System.out.println(new Topic35().GetNumberOfK(new int[]{1,2,3,4,4,4,5,6,7,8}, 6));
    }

    public int GetNumberOfK(int[] array, int k) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == k) {
                return dye(array, mid);
            }
            if (k < array[mid]) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    private int dye(int[] array, int mid) {
        int res = 1, left = mid - 1, right = mid + 1;
        while (left >= 0 && array[left --] == array[mid]) res ++;
        while (right < array.length && array[right ++] == array[mid]) res ++;
        return res;
    }
}