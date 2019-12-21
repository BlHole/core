package com.huaxu.core.leetcode.topic000;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic89</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/05 20:05</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic89 {

    public static void main(String[] args) {
        Integer a = 3;
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.parseUnsignedInt("11"));
        System.out.println(new BigInteger("100", 2));


    }

    class Solution {
        public List<Integer> grayCode(int n) {
            /**
             关键是搞清楚格雷编码的生成过程, G(i) = i ^ (i/2);
             如 n = 3:
             G(0) = 000,
             G(1) = 1 ^ 0 = 001 ^ 000 = 001
             G(2) = 2 ^ 1 = 010 ^ 001 = 011
             G(3) = 3 ^ 1 = 011 ^ 001 = 010
             G(4) = 4 ^ 2 = 100 ^ 010 = 110
             G(5) = 5 ^ 2 = 101 ^ 010 = 111
             G(6) = 6 ^ 3 = 110 ^ 011 = 101
             G(7) = 7 ^ 3 = 111 ^ 011 = 100
             **/
            List<Integer> ret = new ArrayList<>();
            for(int i = 0; i < 1<<n; ++i)
                ret.add(i ^ i>>1);
            return ret;
        }
    }
}