package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic59</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/08/05 19:17</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic59 {

    public static void main(String[] args) {

        int[][] ints = new Topic59().new Solution().generateMatrix(3);

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j]);
            }
            System.out.println();
        }
    }

    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] result = new int[n][n];
            int[][] wsad = {{0,1},{1,0},{0,-1},{-1,0}};
            int x=0, y=-1, self=0; //倒退一步。

            for (int i = 1; i <= n*n;) {
                int tempX = x+wsad[self][0];
                int tempY = y+wsad[self][1];

                if (tempX<n && tempX>=0 && tempY<n && tempY>=0 && result[tempX][tempY] == 0) {
                    x = tempX;
                    y = tempY;
                    result[x][y] = i++;
                }
                else {
                    self = (self+1)%4;
                }
            }
            return result;
        }
    }
}