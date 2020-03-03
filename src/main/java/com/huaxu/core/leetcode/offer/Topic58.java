package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/03 16:41</p>
 * <p>author：huaxu</p>
 */
public class Topic58 {

    public static void main(String[] args) {
        String s = new Topic58().new Solution().reverseWords("  abc. qwe   uio ");
        System.out.println(s);
    }

    class Solution {
        public String reverseWords(String s) {
            StringBuilder res = new StringBuilder("");
            StringBuilder sb = new StringBuilder();
            char[] chars = s.trim().toCharArray();
            for (int i = chars.length - 1; i >= 0; i --) {
                if (i < chars.length - 1 && chars[i + 1] == ' ' && chars[i] == ' ') {
                    continue;
                }
                if (chars[i] == ' '){
                    res.append(sb.reverse() + " ");
                    sb = new StringBuilder();
                } else {
                    sb.append(chars[i]);
                }
            }
            res.append(sb.reverse());
            return res.toString().trim();
        }
    }
}