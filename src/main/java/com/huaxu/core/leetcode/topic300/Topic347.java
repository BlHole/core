package com.huaxu.core.leetcode.topic300;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/26 14:26</p>
 * <p>author：huaxu</p>
 */
public class Topic347 {


    public static void main(String[] args) {
        List<Integer> list = new Topic347().new Solution().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        list.forEach(entry -> System.out.println(entry));
    }

    class Solution {

        class Node {
            int key;
            int value;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        public List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (Integer num : nums) {
                Integer count = map.get(num);
                map.put(num, count == null ? 1 : count + 1);
            }

            PriorityQueue<Node> queue = new PriorityQueue<>(k, new Comparator<Node>() {
                @Override
                public int compare(Node o1, Node o2) {
                    return o2.value - o1.value;
                }
            });

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                queue.offer(new Node(entry.getKey(), entry.getValue()));
            }

            List<Integer> res = new ArrayList<>();
            while (k-- > 0) {
                res.add(queue.poll().key);
            }
            return res;
        }
    }
}