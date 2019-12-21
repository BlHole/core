package com.huaxu.core.leetcode.topic300;


/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/06 12:48</p>
 * <p>author：huaxu</p>
 */
public class Topic392 {

    public static void main(String[] args) {
        String a = "axc";
        String b = "ahbgdc";
        boolean subsequence = new Solution().isSubsequence(a, b);
        System.out.println(subsequence);
    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.length() > t.length()) return false;
            if ("".equals(s)) return true;

            int start = 0, end = s.length();
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == s.charAt(start)) {
                    start ++;
                }
                if (start == end) return true;
            }
            return false;
        }
    }
}