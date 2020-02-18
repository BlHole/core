package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/18 15:25</p>
 * <p>author：huaxu</p>
 */
public class Topic22_2 {

    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ans = new ArrayList();
            if (n == 0) {
                ans.add("");
            } else {
                for (int c = 0; c < n; ++c)
                    for (String left: generateParenthesis(c))
                        for (String right: generateParenthesis(n - 1 - c))
                            ans.add("(" + left + ")" + right);
            }
            return ans;
        }
    }
}