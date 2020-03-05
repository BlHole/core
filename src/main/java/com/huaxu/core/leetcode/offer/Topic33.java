package com.huaxu.core.leetcode.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/03/05 09:50</p>
 * <p>author：huaxu</p>
 */
public class Topic33 {

    public static void main(String[] args) {
        boolean a = new Topic33().new Solution().verifyPostorder(new int[]{4, 8, 6, 12, 16, 14, 10});
        System.out.println(a);
    }

    class Solution {
        public boolean verifyPostorder(int[] postorder) {
            if (postorder.length < 2) return true;

            int[] clone = postorder.clone();
            Arrays.sort(clone);

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < clone.length; i++) {
                map.put(clone[i], i);
            }

            return checkNode(postorder, 0, postorder.length - 1, 0, postorder.length - 1, map);
        }

        private boolean checkNode(int[] postorder, int i, int il, int j, int jl, Map<Integer,Integer> map) {
            if (i >= il || j >= jl) return true;

            int index = map.get(postorder[il]);

            for (int k = i; k <= i + index - j - 1; k++) {
                int flag = map.get(postorder[k]);
                if (flag >= j && flag < index) {
                    continue;
                }
                return false;
            }

            boolean left = checkNode(postorder, i, i + index - j - 1, j , index - 1, map);
            boolean right = checkNode(postorder, i + index - j, il - 1, index + 1 , jl, map);
            return left && right;
        }
    }
}