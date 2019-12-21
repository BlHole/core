package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic54</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/31 14:52</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic54 {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int target =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = ++target;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");

        List<Integer> list = new Topic54().new Solution().spiralOrder(matrix);
        System.out.println(list);
    }

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0) return new ArrayList<>();

            int targetX = matrix.length;
            int targetY = matrix[0].length;
            int x=0, y=0, i;

            List<Integer> result = new ArrayList<>(targetX*targetY);
            int[][] direction = {{0,0},{-1,0},{0,1},{1,0},{0,-1}};

            while (true) {
                matrix[x][y] = 0;
                result.add(matrix[x][y]);
                for (i = 0; i < 5; i++) {
                    int tarX = x+direction[i][0];
                    int tarY = y+direction[i][1];
                    if (tarX<targetX && tarX>=0 && tarY>=0 && tarY<targetY && matrix[tarX][tarY]!=0) {
                        x = tarX;
                        y = tarY;
                        direction[0][0] = direction[i][0];
                        direction[0][1] = direction[i][1];
                        break;
                    }
                }
                if (i == 5) break;
            }
            return result;
        }
    }
}