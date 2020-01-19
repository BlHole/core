package com.huaxu.core.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/19 10:33</p>
 * <p>author：huaxu</p>
 *
 * 把数组排成最小的数
 *
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 * links: https://www.nowcoder.com/questionTerminal/8fecd3f8ba334add803bf2a06af1b993
 */
public class Topic30 {

    public String PrintMinNumber(int[] numbers) {
        List<Integer> res = new ArrayList<>();
        for (int number : numbers) {
            res.add(number);
        }
        Collections.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String v1 = o1 + "" + o2;
                String v2 = o2 + "" + o1;
                return v1.compareTo(v2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Integer re : res) {
            sb.append(re);
        }
        return sb.toString();
    }
}