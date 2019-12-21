package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic14</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/16 23:01</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic14 {

    public static void main(String[] args) {
        String s = new Solution().longestCommonPrefix(new String[]{"aa", "a"});
        System.out.println(s);
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            if (strs.length == 1) return strs[0];

            int i = 0, j = 1, length =strs.length, size = strs[0].length();
            for (; i < size; i++) {
                char c = strs[0].charAt(i);
                for (j = 1; j < length; j++) {
                    int tempLength = strs[j].length();
                    if (i == tempLength || c != strs[j].charAt(i)) break;
                }
                if (j != length) break;
            }
            return strs[0].substring(0, i);
        }
    }
}