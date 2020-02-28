package com.huaxu.core.leetcode.offer;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/28 18:08</p>
 * <p>author：huaxu</p>
 */
public class Topic56 {

    public static void main(String[] args) {
        new Topic56().new Solution().singleNumbers(new int[]{1,2,3,4,1,4});
    }

    class Solution {
        public int[] singleNumbers(int[] nums) {
            int xor = 0;
            for (int num : nums)
                xor ^= num;
            int diff = xor & (-xor);
            int x = 0;
            for (int num : nums) {
                if ((diff & num) != 0)
                    x ^= num;
            }
            return new int[]{x, xor ^ x};
        }
    }
}