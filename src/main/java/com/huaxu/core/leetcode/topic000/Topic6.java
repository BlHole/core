package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Topic_8</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/05/22 17:18</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic6 {

    class Solution {
        public String convert(String s, int numRows) {
            String result = "";
            if (numRows == 1 || s.length() <= numRows) return s;

            for (int i = 0; i < numRows; i++) {
                int start = i;
                int step;
                if ((i == numRows - 1) || (i == 0)) {
                    step = 2 * (numRows - 1);
                    while (start < s.length()) {
                        result += s.charAt(i)+"";
                        start += step;
                    }
                } else {
                    step = 2 * (numRows - 1 - i);
                    while (start < s.length()) {
                        result += s.charAt(i)+"";
                        start += step;
                        step = 2 * numRows - step - 2;
                    }
                }
            }
            return result;
        }
    }
}