package com.huaxu.core.leetcode.offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 17:07</p>
 * <p>author：huaxu</p>
 */
public class Topic38 {



    class Solution {

        private char[] sss = null;
        private Set<String> list = new HashSet<>();

        public String[] permutation(String s) {
            if (s.length() < 2) return new String[]{s};
            sss = s.toCharArray();
            boolean[] map = new boolean[sss.length];
            dfs(0, sss.length, map, "");
            String[] res = new String[list.size()];
            list.toArray(res);
            return res;
        }

        private void dfs(int step, int length, boolean[] map, String str) {
            if (step == length) {
                list.add(str);
                return;
            }
            for (int i = 0; i < length; i ++) {
                if (!map[i]) {
                    map[i] = true;
                    dfs(step + 1, length, map, str + sss[i]);
                    map[i] = false;
                }
            }
        }
    }
}