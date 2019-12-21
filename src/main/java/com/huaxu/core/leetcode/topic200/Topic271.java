package com.huaxu.core.leetcode.topic200;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic271</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/24 21:39</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic271 {

    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>(nums.length);
            for (int num : nums) {
                set.add(num);
            }
            return set.size() != nums.length;
        }
    }
}