package com.huaxu.core.leetcode.topic000;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic54_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/31 15:51</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic54_2 {

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

        List<Integer> list = new Topic54_2().new Solution().spiralOrder(matrix);
        System.out.println(list);
    }

    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List ans = new ArrayList();
            if (matrix.length == 0) return ans;
            int R = matrix.length, C = matrix[0].length;
            boolean[][] seen = new boolean[R][C];
            int[] dr = {0, 1, 0, -1};
            int[] dc = {1, 0, -1, 0};
            int r = 0, c = 0, di = 0;
            for (int i = 0; i < R * C; i++) {
                ans.add(matrix[r][c]);
                seen[r][c] = true;
                int cr = r + dr[di];
                int cc = c + dc[di];
                if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]){
                    r = cr;
                    c = cc;
                } else {
                    di = (di + 1) % 4;
                    r += dr[di];
                    c += dc[di];
                }
            }
            return ans;
        }
    }
}