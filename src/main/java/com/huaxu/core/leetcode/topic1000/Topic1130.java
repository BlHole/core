package com.huaxu.core.leetcode.topic1000;

import java.util.LinkedList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 23:02</p>
 * <p>author：huaxu</p>
 */
public class Topic1130 {

    class Solution {
        public int[] distributeCandies(int candies, int num_people) {

            int[] res = new int[num_people];
            LinkedList<Integer> queue = new LinkedList<>();
            for (int i = 0; i < num_people; i ++) {
                queue.addLast(i);
            }
            int index = 1;
            while (candies != 0) {
                Integer pre = queue.pollFirst();
                if (candies - index >= 0) {
                    res[pre] += index;
                    candies -= index++;
                } else if (candies > 0) {
                    res[pre] += candies;
                    candies = 0;
                } else break;
                queue.addLast(pre);
            }
            return res;
        }
    }
}