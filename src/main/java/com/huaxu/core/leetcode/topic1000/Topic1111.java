package com.huaxu.core.leetcode.topic1000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/04/01 18:14</p>
 * <p>author：huaxu</p>
 */
public class Topic1111 {

    public class Solution {
        public int[] maxDepthAfterSplit(String seq) {
            int[] ans = new int [seq.length()];
            int idx = 0;
            for(char c: seq.toCharArray()) {
                ans[idx++] = c == '(' ? idx & 1 : ((idx + 1) & 1);
            }
            return ans;
        }
    }
}