package com.huaxu.core.leetcode.topic200;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic292</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 20:20</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic292 {

    public static void main(String[] args) {
        System.out.println(16>>2);
    }

    class Solution {
        public boolean canWinNim(int n) {
            return (n & 3) != 0;// n%4 != 0
        }
    }
}