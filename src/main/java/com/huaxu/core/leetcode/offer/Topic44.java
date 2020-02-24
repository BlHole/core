package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/24 11:27</p>
 * <p>author：huaxu</p>
 */
public class Topic44 {

    class Solution {
        public int findNthDigit(int n) {
            if(n < 10) return n;
            //计算当前范围有几位数字 如10-99 有90*power位 power = 2
            int count = 0;
            int power = 1;
            while(true){
                count = helper(power);
                //n在count这个范围内
                if(n < count) break;
                n -= count;
                power++;
            }
            //计算计数到的这个数字
            //Math.pow(10,power-1) -- 起始数字 n/power -- 剩余补充数字
            int resNum = (int)(Math.pow(10,power-1) + n/power);
            return String.valueOf(resNum).charAt(n % power) - '0';
        }
        public int helper(int power){
            if(power == 1) return 10;
            return (int)(Math.pow(10,power-1) * 9 * power);
        }
    }
}