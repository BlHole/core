package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 15:41</p>
 * <p>author：huaxu</p>
 *
 * 变态跳台阶
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * links: https://www.nowcoder.com/questionTerminal/22243d016f6b47f2a6928b4313c85387
 */
public class Topic09 {

    class Solution {
        public int JumpFloorII(int target) {
            if (target == 0) return 0;
            if (target < 3) return target;
            int sum = 3, num = 2;
            for (int i = 3; i <= target; i ++) {
                num = sum + 1;
                sum = sum + num;
            }
            return num;
        }
    }
}