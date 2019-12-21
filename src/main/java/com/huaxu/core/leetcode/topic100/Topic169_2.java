package com.huaxu.core.leetcode.topic100;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic100.Topic169_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/27 22:08</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic169_2 {

    public static void main(String[] args) {
        new Topic169_2().new Solution().majorityElement(new int[]{3,2,3});
    }

    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num)+1);
                } else {
                    map.put(num, 1);
                }
            }
            int basic = nums.length/2;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() > basic) return entry.getKey();
            }
            return 0;
        }
    }
}