package com.huaxu.core.leetcode.topic500;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic500.Topic557</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/15 21:49</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic557 {

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        Solution solution = new Solution();
        String s = solution.reverseWords(str);
        System.out.println(s);
    }

    static class Solution {
        public String reverseWords(String s) {
            String flag = " ";
            StringBuilder result = new StringBuilder();
            for (String temp : s.split(flag)) {
                for (int i = temp.length()-1; i >= 0; i--) {
                    result.append(temp.charAt(i));
                }
                result.append(flag);
            }
            return result.toString().substring(0, s.length());
        }
    }
}