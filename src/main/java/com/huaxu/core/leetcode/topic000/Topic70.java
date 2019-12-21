package com.huaxu.core.leetcode.topic000;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic70</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 21:37</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic70 {

    class Solution {
        Map<Integer, Integer> map = new HashMap<>();
        public int climbStairs(int n) {
            if (map.containsKey(n)) return map.get(n);
            if (n==1) return 1;
            if (n==2) return 2;

            int x = climbStairs(n-1) + climbStairs(n-2);
            map.put(n, x);
            return x;
        }
    }
}