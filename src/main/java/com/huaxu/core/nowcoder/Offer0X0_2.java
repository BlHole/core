package com.huaxu.core.nowcoder;

import java.util.ArrayList;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 11:45</p>
 * <p>author：huaxu</p>
 */
public class Offer0X0_2 {

    class Solution {
        // a->b = (a + b) * (b - a + 1) / 2
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            int left = 1, right = 2;
            while (right > left && right <= sum) {
                int ans = (left + right) * (right - left + 1) / 2;
                if (ans == sum) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    for (int i = left; i <= right; i ++) {
                        temp.add(i);
                    }
                    res.add(temp);
                    left ++;
                }
                if (ans < sum) right ++;
                if (ans > sum) left ++;
            }
            return res;
        }
    }
}