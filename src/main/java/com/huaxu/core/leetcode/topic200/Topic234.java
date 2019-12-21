package com.huaxu.core.leetcode.topic200;

import com.huaxu.core.leetcode.basic.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_8</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 17:18</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic234 {

    static class Solution {
        public boolean isPalindrome(ListNode head) {

            List<Integer> list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            int i=0, j=list.size()-1;
            while (i<j) {
                if (!list.get(i).equals(list.get(j))) return false;
                i++;
                j--;
            }
            return true;
        }
    }
}