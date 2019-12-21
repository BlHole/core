package com.huaxu.core.leetcode.topic200;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: topic200.Topic231_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/18 19:55</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic231_2 {

    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n<=0) return false;
            if((n&n-1)==0) return true;
            return false;
        }
    }
}