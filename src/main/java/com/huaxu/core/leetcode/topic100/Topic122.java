package com.huaxu.core.leetcode.topic100;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic122</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/03 19:54</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic122 {


    public static void main(String[] args) {
        int a = new Topic122().new Solution().maxProfit(new int[]{7,6,4,3,1});
        System.out.println(a);
    }

    class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length < 2) return 0;
            int temp = prices[0], sum = 0;
            for (int price : prices) {
                if (price > temp) {
                    sum += price - temp;
                }
                temp = price;
            }
            return sum;
        }
    }
}