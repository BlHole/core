package com.huaxu.core.leetcode.topic300;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic300.Topic341</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 19:57</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic341 {

    class Solution {
        public void reverseString(char[] s) {
            if (s == null || s.length <= 1) return;
            int i=0,j=s.length-1;
            while (i<j) {
                char temp = s[i];
                s[i++] = s[j];
                s[j--] = temp;
            }
        }
    }
}