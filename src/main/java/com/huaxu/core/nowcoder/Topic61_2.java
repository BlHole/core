package com.huaxu.core.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/03 15:22</p>
 * <p>author：huaxu</p>
 */
public class Topic61_2 {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new Topic61_2().maxInWindows(new int[]{2,3,4,2,6,2,5,1}, 3);
        System.out.println(Arrays.toString(integers.toArray()));
    }

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size == 0 || num.length == 0 || size > num.length) return res;

        //双端队列，用来记录每个窗口的最大值下标
        LinkedList<Integer> qmax = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            while (!qmax.isEmpty() && num[qmax.peekLast()] < num[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            //判断队首元素是否过期
            if (qmax.peekFirst() == i - size) {
                qmax.pollFirst();
            }
            //向result列表中加入元素
            if (i >= size - 1) {
                res.add(num[qmax.peekFirst()]);
            }
        }
        return res;
    }
}