package com.huaxu.core.leetcode.topic100;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_136</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/28 14:55</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic136 {

    public static void main(String[] args) {

    }

    class Solution {
        public int singleNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    set.remove(num);
                } else {
                    set.add(num);
                }
            }
            return set.toArray(new Integer[1])[0];
        }
    }
}