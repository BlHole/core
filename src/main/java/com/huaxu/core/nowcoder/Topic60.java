package com.huaxu.core.nowcoder;

import org.apache.commons.collections.list.TreeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/31 09:14</p>
 * <p>author：huaxu</p>
 *
 * 数据流中的中位数
 *
 * 题目描述
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，
 * 使用GetMedian()方法获取当前读取数据的中位数。
 *
 * links: https://www.nowcoder.com/questionTerminal/9be0172896bd43948f8a32fb954e1be1
 */
public class Topic60 {

    private List<Integer> res = new ArrayList<>();

    public void Insert(Integer num) {
        res.add(num);
        Collections.sort(res);
    }

    public Double GetMedian() {
        int size = res.size();
        if (size == 0) return 0.0;

        if ((size & 1) == 1) {
            return (double)res.get((size - 1) / 2);
        }
        return (res.get(size / 2) + res.get((size / 2) - 1))/ 2.0;
    }
}