package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic28</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/26 22:07</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic28 {

    public static void main(String[] args) {
        int i = new Topic28().new Solution().strStr("aaaaa", "");
        System.out.println(i);
    }

    class Solution {
        public int strStr(String haystack, String needle) {
            if ("".equals(needle)) return 0;
            for (int i = 0, length = haystack.length(), basic = needle.length(), index = 0; i < length; i++) {
                int j = i;
                while (j < length && (haystack.charAt(j) == needle.charAt(index))) {
                    j++;
                    index++;
                    if (index == basic) return i;
                }
                index = 0;
            }
            return -1;
        }
    }
}