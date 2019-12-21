package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Tpoic_78</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/05/27 15:19</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic78 {

    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            int length = nums.length;
            List<List<Integer>> result = new ArrayList<>();
            double pow = Math.pow(2, nums.length);
            for (int i = 0; i < pow; i++) {
                List<Integer> temp = new ArrayList<>();
                char[] chars = Integer.toBinaryString(i).toCharArray();
                for (int j = chars.length-1; j >= 0; j--) {
                    if (chars[j] == '1')
                        temp.add(nums[length-chars.length+j]);
                }
                result.add(temp);
            }
            return result;
        }
    }
}
