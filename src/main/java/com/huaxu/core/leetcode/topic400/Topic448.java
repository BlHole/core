package com.huaxu.core.leetcode.topic400;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic400.Topic448</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/13 22:14</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic448 {

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0, length = nums.length; i < length; i++) {
                int abs = Math.abs(nums[i]);
                nums[abs - 1] = -Math.abs(nums[abs - 1]);
            }
            for (int i = 0, length = nums.length; i < length; i++) {
                if (nums[i] > 0) {
                    result.add(i+1);
                }
            }
            return result;
        }
    }
}