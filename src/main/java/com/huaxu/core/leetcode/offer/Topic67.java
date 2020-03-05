package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 18:06</p>
 * <p>author：huaxu</p>
 */
public class Topic67 {

    public static void main(String[] args) {
        Solution solution = new Topic67().new Solution();
//        System.out.println(solution.strToInt("   -2323"));
//        System.out.println(solution.strToInt("   -000002323"));
//        System.out.println(solution.strToInt("   000002nn323"));
//        System.out.println(solution.strToInt("   -299999999999323"));
        System.out.println(solution.strToInt("2147483646"));
    }

    class Solution {
        public int strToInt(String str) {
            char[] chars = str.trim().toCharArray();
            if (chars.length == 0) return 0;
            if (chars.length == 1 && (chars[0] == '-' || chars[0] == '+')) return 0;
            long res = 0;
            if (chars[0] == '-') {
                int i = 1;
                for (; i < chars.length; i++) {
                    if (chars[i] != '0') {
                        break;
                    }
                }
                for (; i < chars.length; i++) {
                    if (chars[i] >= '0' && chars[i] <= '9') {
                        res = (res + (chars[i] - '0')) * 10;
                        if ((res / 10) * -1 < Integer.MIN_VALUE) {
                            return Integer.MIN_VALUE;
                        }
                        continue;
                    }
                    break;
                }
                return (res / 10) * -1 < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int)((res / 10) * -1);
            }
            if (chars[0] == '+') {
                int i = 1;
                for (; i < chars.length; i++) {
                    if (chars[i] != '0') {
                        break;
                    }
                }
                for (; i < chars.length; i++) {
                    if (chars[i] >= '0' && chars[i] <= '9') {
                        res = (res + (chars[i] - '0')) * 10;
                        if ((res / 10) > Integer.MAX_VALUE) {
                            return Integer.MAX_VALUE;
                        }
                        continue;
                    }
                    break;
                }
                return (res / 10) > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)(res / 10);
            }
            int i = 0;
            for (; i < chars.length; i++) {
                if (chars[i] != '0') {
                    break;
                }
            }
            for (; i < chars.length; i++) {
                if (chars[i] >= '0' && chars[i] <= '9') {
                    res = (res + (chars[i] - '0')) * 10;
                    if ((res / 10) >= Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    continue;
                }
                break;
            }
            return (res / 10) > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)(res / 10);
        }
    }
}