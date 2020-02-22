package com.huaxu.core.leetcode.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/22 16:17</p>
 * <p>author：huaxu</p>
 */
public class Topic29 {

    class Solution {

        private int[] colx = {0, 1, 0, -1};
        private int[] coly = {1, 0, -1, 0};

        private boolean[][] map = null;

        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0)
                return new int[0];
            map = new boolean[matrix.length][matrix[0].length];
            int[] res = new int[matrix.length * matrix[0].length];
            map[0][0] = true;
            dfs(matrix, map, 0, 0, res, 0, 0);
            return res;
        }

        private void dfs(int[][] matrix, boolean[][] map, int i, int j, int[] res, int step, int v) {
            res[step ++] = matrix[i][j];
            if (step + 1 == matrix.length * matrix[0].length) {
                return;
            }
            for (int k = v; k < v + 4; k ++) {
                int tempX = i + colx[k % 4];
                int tempY = j + coly[k % 4];
                if (tempX >= 0 && tempY >= 0 && tempX < matrix.length && tempY < matrix[0].length
                        && !map[tempX][tempY]) {
                    map[tempX][tempY] = true;
                    dfs(matrix, map, tempX, tempY, res, step + 1, k);
                }
            }
        }
    }
}