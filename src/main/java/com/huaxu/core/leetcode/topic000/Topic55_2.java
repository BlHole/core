package com.huaxu.core.leetcode.topic000;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/26 17:41</p>
 * <p>author：huaxu</p>
 */
public class Topic55_2 {

    enum Index {
        GOOD, BOD, INIT;
    }

    class Solution {

        private Index[] indexs;

        public boolean canJump(int[] nums) {
            this.indexs = new Index[nums.length];
            for (int i = 0; i < indexs.length; i++) {
                indexs[i] = Index.INIT;
            }
            indexs[indexs.length - 1] = Index.GOOD;
            return solution(0, nums);
        }

        private boolean solution(int i, int[] nums) {
            if (indexs[i] != Index.INIT) {
                return indexs[i] == Index.GOOD;
            }
            int limit = Math.min(nums[i] + i, nums.length - 1);
            for (int j = i + 1; j <= limit; j ++) {
                if (solution(j, nums)) {
                    indexs[i] = Index.GOOD;
                    return true;
                }
            }
            indexs[i] = Index.BOD;
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Topic55_2().new Solution().canJump(new int[]{2, 0, 0}));
    }
}