package com.huaxu.core.leetcode.topic200;

import java.util.PriorityQueue;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic215_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/06 20:28</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic215_2 {

    public static void main(String[] args) {
        new Topic215_2().new Solution().findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }

    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int val : nums){
                pq.add(val);
                if(pq.size() > k) pq.poll();
            }
            return pq.peek();
        }
    }
}