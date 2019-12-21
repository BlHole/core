package com.huaxu.core.leetcode.topic000;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic1</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 09:38</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic1 {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int targetNum = target - nums[i];
                if (map.containsKey(targetNum)) {
                    return new int[]{i, map.get(targetNum)};
                }
                map.put(nums[i], i);
            }
            throw new IllegalAccessError("no result expect");
        }
    }
}