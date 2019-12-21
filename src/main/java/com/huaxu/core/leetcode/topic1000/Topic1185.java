package com.huaxu.core.leetcode.topic1000;

import java.util.concurrent.DelayQueue;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/28 18:32</p>
 * <p>author：huaxu</p>
 */
public class Topic1185 {


    class Solution {
        private final String[] week = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        public String dayOfTheWeek(int day, int month, int year) {
            // Zeller Formula
            if(month == 1 || month == 2) {
                month += 12;
                year -= 1;
            }
            return week[(day+2*month+3*(month+1)/5+year+year/4-year/100+year/400+1) % 7];
        }
    }
}