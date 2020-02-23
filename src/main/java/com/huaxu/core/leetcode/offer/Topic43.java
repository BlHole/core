package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/23 10:36</p>
 * <p>author：huaxu</p>
 */
public class Topic43 {

    public static void main(String[] args) {

        new Topic43().new Solution().countDigitOne(123);
    }

    class Solution {
        public int countDigitOne(int n) {
            //求每个位的数字所用
            int index = 1;
            int count = 0;
            int high = n,cur = 0,low = 0;
            //由于high = n /(index*10) 中index *10 很容易越位
            //特修改如下
            while(high > 0){
                high /= 10;
                cur = (n / index) % 10;
                low = n - (n / index) * index;
                //以下是计算的公式
                if(cur == 0) count += high * index;
                if(cur == 1) count += high * index + low + 1;
                if(cur > 1) count += (high+1) * index;
                index *= 10;
            }
            return count;
        }
    }
}