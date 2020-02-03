package com.huaxu.core.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/02 17:31</p>
 * <p>author：huaxu</p>
 *
 * 滑动窗口的最大值
 *
 * 题目描述
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 *
 * links: https://www.nowcoder.com/questionTerminal/1624bc35a45c42c0bc17d17fa0cba788
 */
public class Topic61 {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new Topic61().maxInWindows(new int[]{2,3,4,2,6,2,5,1}, 3);
        System.out.println(Arrays.toString(integers.toArray()));
    }

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size == 0 || num.length < 1 || num.length < size) return res;
        int index = num.length + 1 - size;

        List<Integer> temp = null;
        for (int i = 0; i < index; i++) {
            temp = new ArrayList<>();
            for (int j = i; j < i + size; j ++) {
                temp.add(num[j]);
            }
            Collections.sort(temp);
            res.add(temp.get(size - 1));
        }
        return res;
    }
}