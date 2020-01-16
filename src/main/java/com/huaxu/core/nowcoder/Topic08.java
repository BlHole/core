package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 15:37</p>
 * <p>author：huaxu</p>
 *
 * 跳台阶
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * links: https://www.nowcoder.com/questionTerminal/8c82a5b80378478f9484d87d1c5f12a4
 */
public class Topic08 {


    class Solution {
        public int JumpFloor(int target) {
            if (target < 3) return target;
            return JumpFloor(target - 1) + JumpFloor(target - 2);
        }
    }
}