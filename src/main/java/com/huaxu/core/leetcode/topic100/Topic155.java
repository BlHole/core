package com.huaxu.core.leetcode.topic100;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic155</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 18:52</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic155 {

    class MinStack {

        List<Integer> data = null;
        /** initialize your data structure here. */
        public MinStack() {
            data = new ArrayList<>();
        }

        public void push(int x) {
            data.add(x);
        }

        public void pop() {
            data.remove(data.size()-1);
        }

        public int top() {
            if (data.isEmpty()) return 0;
            return data.get(data.size()-1);
        }

        public int getMin() {
            int min = Integer.MAX_VALUE;
            for (Integer datum : data) {
                min = Math.min(datum, min);
            }
            return min;
        }
    }
}