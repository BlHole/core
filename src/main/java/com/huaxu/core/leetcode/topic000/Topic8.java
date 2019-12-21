package com.huaxu.core.leetcode.topic000;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_8</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 17:18</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic8 {


    public static void main(String[] args) {
        int i = new Solution().myAtoi("2147483648");
        System.out.println(i);
    }

    static class Solution {
        public int myAtoi(String str) {

            int symbol = 1;
            str = str.trim();
            if (str.isEmpty())
                return 0;
            else if (str.charAt(0) == '-' || str.charAt(0) == '+') {
                symbol = Integer.parseInt(str.charAt(0)+"1");
                str = str.substring(1);
            }

            char num[] = {'0','1','2','3','4','5','6','7','8','9'};
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < num.length; i++)
                map.put(num[i], Integer.parseInt(num[i]+""));

            if (str.isEmpty() || !map.containsKey(str.charAt(0)))
                return 0;

            long sum =0;
            for (int i =0; i <str.length(); i++) {
                char temp = str.charAt(i);
                if (temp != '.' && map.containsKey(temp))
                    sum = sum * 10 + map.get(temp);
                else
                    break;
                if (sum*symbol >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (sum*symbol <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            return (int) sum*symbol;
        }
    }
}