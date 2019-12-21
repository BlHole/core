package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic000.Topic14_3</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/17 18:57</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic14_3 {

    public static void main(String[] args) {
        String s = new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(s);
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0)
                return "";
            int minLen = Integer.MAX_VALUE;
            for (String str : strs)
                minLen = Math.min(minLen, str.length());
            int low = 1;
            int high = minLen;
            while (low <= high) {
                int middle = (low + high) / 2;
                if (isCommonPrefix(strs, middle))
                    low = middle + 1;
                else
                    high = middle - 1;
            }
            return strs[0].substring(0, high);
        }

        private boolean isCommonPrefix(String[] strs, int len){
            String str1 = strs[0].substring(0,len);
            for (int i = 1; i < strs.length; i++)
                if (!strs[i].startsWith(str1))
                    return false;
            return true;
        }
    }
}