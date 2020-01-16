package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 16:53</p>
 * <p>author：huaxu</p>
 *
 * 矩形覆盖
 *
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * links: https://www.nowcoder.com/questionTerminal/72a5a919508a4251859fb2cfb987a0e6
 */
public class Topic10 {

    class Solution {
        public int RectCover(int target) {
            if (target < 3) return target;
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}