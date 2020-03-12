package com.huaxu.core.leetcode.topic1000;

import com.huaxu.core.classLoader.A;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/12 16:59</p>
 * <p>author：huaxu</p>
 */
public class Topic1071 {

    public static void main(String[] args) {
        System.out.println(new Topic1071().new Solution().gcdOfStrings("ABABAB", "ABABAB").equals("ABABAB"));
        System.out.println(new Topic1071().new Solution().gcdOfStrings("ABACCC", "ABA").equals(""));
        System.out.println(new Topic1071().new Solution().gcdOfStrings("ABABAB", "AB").equals("AB"));
        System.out.println(new Topic1071().new Solution().gcdOfStrings("ABABAB", "ABAB").equals("AB"));
    }

    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if (str1.length() == 0 || str2.length() == 0) return "";
            int Alength = str1.length(), Blength = str2.length(), max = 0;
            char[] Arr = str1.toCharArray(), Brr = str2.toCharArray();

            for (int i = 0, length = Math.max(Alength, Blength); i < length; i++) {
                if (Arr[i % Alength] != Brr[i % Blength]) return "";

                if (Alength % (i + 1) == 0 && Blength % (i + 1) == 0) {
                    max = Math.max(max, i + 1);
                }
            }
            return str1.substring(0, max);
        }
    }
}