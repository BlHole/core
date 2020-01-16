package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 15:26</p>
 * <p>author：huaxu</p>
 *
 * 旋转数组的最小元素
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * links: https://www.nowcoder.com/questionTerminal/9f3231a991af4f55b95579b44b7a01ba
 */
public class Topic06 {

    class Solution {
        public int minNumberInRotateArray(int[] array) {
            if (array.length == 0) return 0;
            int res = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < res) return array[i];
            }
            return res;
        }
    }
}