package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic14_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/16 23:15</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic14_2 {

    public static void main(String[] args) {
        String s = new Solution().longestCommonPrefix(new String[]{"aa", "a"});
        System.out.println(s);
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";
            return longestCommonPrefix(strs, 0, strs.length-1);
        }

        private String longestCommonPrefix(String[] strs, int i, int j) {
            if (i == j) return strs[i];
            else {
                int mid = (i+j)/2;
                String left = longestCommonPrefix(strs, i, mid);
                String right = longestCommonPrefix(strs, mid+1, j);
                return commonPrefix(left, right);
            }
        }

        private String commonPrefix(String left, String right) {
            int min = Math.min(left.length(), right.length());
            for (int i = 0; i < min; i++) {
                if (left.charAt(i) != right.charAt(i)) {
                    return left.substring(0,i);
                }
            }
            return left.substring(0, min);
        }

    }
}