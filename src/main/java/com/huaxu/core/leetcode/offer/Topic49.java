package com.huaxu.core.leetcode.offer;

import org.springframework.data.redis.listener.Topic;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 16:29</p>
 * <p>author：huaxu</p>
 */
public class Topic49 {

    public static void main(String[] args) {
        new Topic49().new  Solution().nthUglyNumber(10);
    }


    class Solution {
        public int nthUglyNumber(int n) {

            int[] res = new int[n];
            res[0] = 1;
            int p2 = 0, p3 = 0, p5 = 0;
            for (int i = 1; i < n; i++) {
                res[i] = Math.min(res[p2] * 2, Math.min(res[p3] * 3, res[p5] * 5));
                if (res[i] == res[p2] * 2) p2 ++;
                if (res[i] == res[p3] * 3) p3 ++;
                if (res[i] == res[p5] * 5) p5 ++;
            }
            return res[n - 1];
        }
    }
}
/**

 1  1
 2  2 2
 3  3 3
 4  4 2 * 2
 5  5 5
 6  6 3 * 2

 7  8 2 * 2 * 2
 8  9 3 * 3
 9  10 5 * 2
 10 12 3 * 2 * 2
 11 15 5 * 3
 12 16 2 * 2 * 2 * 2

 13 18 3 * 3 * 2
 14 20 5 * 2 * 2
 15 24 3 * 2 * 2 * 2
 16 25 5 * 5



 */