package com.huaxu.core.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/18 11:43</p>
 * <p>author：huaxu</p>
 */
public class Topic27_2 {

    private boolean[] map;
    private Set<String> res = new LinkedHashSet<>();

    public ArrayList<String> Permutation(String str) {
        if (str != null && str.length() > 0) {
            map = new boolean[str.length()];
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            dfs(arr, "", arr.length);
        }
        return new ArrayList<>(res);
    }

    private void dfs(char[] arr, String s, int end) {
        if (s.length() == end) {
            res.add(s);
            return;
        }

        for (int i = 0; i < end; i ++) {
            if (!map[i]) {
                map[i] = true;
                dfs(arr, s + arr[i], end);
                map[i] = false;
            }
        }
    }
}