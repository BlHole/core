package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/02 12:56</p>
 * <p>author：huaxu</p>
 */
public class Topic54_3 {

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

        List<Integer> list = new Solution().spiralOrder(matrix);
        System.out.println(list);
    }

    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0) return new ArrayList<>();
            int[][] direction = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
            int targetX = matrix.length, targetY = matrix[0].length;
            int x = 0, y = 0, size = targetX * targetY;

            List<Integer> res = new ArrayList<>(size);
            res.add(matrix[x][y]);
            matrix[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                while (x + direction[i][0] <= targetX && y + direction[i][1] <= targetY && x + direction[i][0] >=0 && y + direction[i][1] >=0 && matrix[x + direction[i][0]][y + direction[i][1]] != 0) {
                    res.add(matrix[x + direction[i][0]][y + direction[i][1]]);
                    matrix[x + direction[i][0]][y + direction[i][1]] = 0;
                    x += direction[i][0];
                    y += direction[i][1];
                }
                i %= 4;
                if (res.size() == size) { break;}
            }
            return res;
        }
    }
}