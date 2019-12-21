package com.huaxu.core.leetcode.topic000;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic23</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/15 23:08</p>
 * <p>创建用户：huaxu</p>
 */

public class Topic23_2 {


    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            List<Integer> result = new ArrayList<>();
            for (ListNode list : lists) {
                while (list != null) {
                    result.add(list.val);
                    list = list.next;
                }
            }
            if (result.isEmpty()) return null;
            Integer[] sort = new Integer[result.size()];
            Arrays.sort(result.toArray(sort));
            return newNode(new ArrayList<>(Arrays.asList(sort)));
        }

        public ListNode newNode(List<Integer> vars){
            if (vars.size() == 1) return new ListNode(vars.get(0));
            ListNode node = new ListNode(vars.get(0));
            vars.remove(0);
            node.next = newNode(vars);
            return node;
        }
    }
}