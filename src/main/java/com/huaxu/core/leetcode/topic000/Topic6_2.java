package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/12 20:20</p>
 * <p>author：huaxu</p>
 */
public class Topic6_2 {

    /**
     * L     D     R
     * E   O E   I I
     * E C   I H   N
     * T     S     G
     *
     * 0      6        12
     * 1    5 7     11 13
     * 2  4   8  10    14
     * 3      9
     */

    public static void main(String[] args) {
        String leetcodeishiring = new Topic6_2().new Solution().convert("LEETCODEISHIRING", 4);
        System.out.println("LDREOEIIECIHNTSG");
        System.out.println(leetcodeishiring);
    }
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) return s;
            StringBuilder sf = new StringBuilder();
            for (int i = 0, h = s.length(); i < numRows; i ++) {
                int index = i;
                while (index < h) {
                    sf.append(s.charAt(index));
                    if (i != 0 && i != numRows - 1) {
                        int r = index + 2 * (numRows - 1 - i);
                        if (r < s.length()) {
                            sf.append(s.charAt(r));
                        }
                    }
                    index += 2 * numRows - 2;
                }
            }
            return sf.toString();
        }
    }
}