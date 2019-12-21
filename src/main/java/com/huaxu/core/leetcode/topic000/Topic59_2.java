package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic59_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/05 19:45</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic59_2 {

    public static void main(String[] args) {
        int[][] ints = new Topic59_2().new Solution().generateMatrix(4);
    }

    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            // 遍历填充的数字
            int num = 1;
            // 每一圈左边起始位置和右边结束位置 由于是正方形所以列相同
            int left = 0,right = n-1;
            while(left <= right){
                // 最中间的一个
                if(left==right) matrix[left][right] = num++;
                // 最上面一行 除去最后一个
                for(int i=left;i<right;i++) matrix[left][i] = num++;
                // 最右边一列 除去最后一个
                for(int i=left;i<right;i++) matrix[i][right] = num++;
                // 最下面一行 除去最后一个（逆序）
                for(int i=right;i>left;i--) matrix[right][i] = num++;
                // 最左边一列 除去最后一个（逆序）
                for(int i=right;i>left;i--) matrix[i][left] = num++;
                // 一圈遍历结束 遍历下一圈
                left++;
                right--;
            }
            return matrix;
        }
    }
}