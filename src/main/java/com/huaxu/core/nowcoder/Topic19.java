package com.huaxu.core.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 20:24</p>
 * <p>author：huaxu</p>
 *
 * 顺时针打印矩阵
 *
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，
 * 如果输入如下4 X 4矩阵：
 *   1  2  3  4
 *   5  6  7  8
 *   9 10 11 12
 *  13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * links: https://www.nowcoder.com/questionTerminal/9b4c81a02cd34f76be2659fa0d54342a
 *
 */
public class Topic19 {

    public static void main(String[] args) {
        int N = 5, seq = 1;
        int[][] matrix = new int[1][5];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = seq++;
            }
        }
        ArrayList<Integer> integers = new Topic19().new Solution().printMatrix(matrix);
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }

    class Solution {
        private int[] colx = {0, 1,  0, -1};
        private int[] coly = {1, 0, -1,  0};

        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> res = new ArrayList<>();
            dfs(matrix, res, 0, 0, 0, matrix.length, matrix[0].length);
            return res;
        }

        private void dfs(int[][] matrix, ArrayList<Integer> res, int x, int y, int dire, int lengthX, int lengthY) {
            res.add(matrix[x][y]);
            matrix[x][y] = 0;

            if (res.size() != lengthX * lengthY) {
                for (int i = 0; i < 4; i++) {
                    int dr = (dire + i) % 4;
                    int tempX = x + colx[dr];
                    int tempY = y + coly[dr];
                    if (tempX >= 0 && tempX < lengthX && tempY >= 0 && tempY < lengthY && matrix[tempX][tempY] != 0) {
                        dfs(matrix, res, tempX, tempY, dr, lengthX, lengthY);
                    }
                }
            }
        }
    }
}