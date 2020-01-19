package com.huaxu.core.nowcoder;

import java.util.ArrayList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 11:49</p>
 * <p>author：huaxu</p>
 *
 * <合为S的两个数字/>
 *      输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 *      links: https://www.nowcoder.com/practice/390da4f7a00f44bea7c2f3d19491311b?tpId=13&tqId=11195&tPage=3&rp=3&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Topic40 {

    class Solution {
        public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
            int min = Integer.MAX_VALUE, length = array.length;
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < length; i ++) {
                for (int j = i + 1; j < length; j++) {
                    if (sum == array[i] + array[j] && min > array[i] * array[j]) {
                        min = array[i] * array[j];
                        res.clear();
                        res.add(array[i]);
                        res.add(array[j]);
                    }
                }
            }
            return res;
        }
    }
}