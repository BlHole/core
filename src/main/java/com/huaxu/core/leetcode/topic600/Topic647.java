package com.huaxu.core.leetcode.topic600;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/04/01 18:17</p>
 * <p>author：huaxu</p>
 */
public class Topic647 {

    class Solution {
        public int countSubstrings(String S) {
            int N = S.length(), ans = 0;
            for (int center = 0; center <= 2*N-1; ++center) {
                int left = center / 2;
                int right = left + center % 2;
                while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                    ans++;
                    left--;
                    right++;
                }
            }
            return ans;
        }
    }
}