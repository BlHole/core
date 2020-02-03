package com.huaxu.core.nowcoder;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/03 15:52</p>
 * <p>author：huaxu</p>
 *
 * 矩阵中的路径
 *
 * 题目描述
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一个格子开始，
 * 每一步可以在矩阵中向左，向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 *
 *         a b c e
 *         s f c s
 *         a d e e
 *
 * links: https://www.nowcoder.com/questionTerminal/c61c6999eecb4b8f88a98f66b273a3cc
 */
public class Topic62 {

    public static void main(String[] args) {
        boolean b = new Topic62().hasPath("ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS".toCharArray(), 5, 8, "SGGFIECVAASABCEHJIGQEM".toCharArray());
        System.out.println(b);
    }

    private final int[] colx = {0, 1, 0, -1};
    private final int[] coly = {1, 0, -1, 0};

    private boolean[][] map;
    private char[][] charMap;
    private boolean res;
    private Map<String, Boolean> cache = new HashMap<>();

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (str.length == 0 || matrix.length == 0) return false;
        map = new boolean[rows][cols];
        charMap = new char[rows][cols];
        for (int i = 0, index = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                charMap[i][j] = matrix[index ++];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (charMap[i][j] == str[0]) {
                    map[i][j] = true;
                    res = false;
                    dfs(i, j, str, 1);
                    if (res) return true;
                    map[i][j] = false;
                }
            }
        }
        return false;
    }

    private void dfs(int i, int j, char[] str, int step) {
        if (cache.containsKey(i + "_" + j + "_" + step)) {
            return;
        }
        if (str.length == step) {
            res = true;
            return;
        }
        for (int k = 0; k < 4; k++) {
            int x = i + colx[k];
            int y = j + coly[k];
            if (x >= 0 && x < map.length && y >= 0 && y < map[0].length && !map[x][y] && str[step] == charMap[x][y]) {
                map[x][y] = true;
                dfs(x, y, str, step + 1);
                map[x][y] = false;
            }
        }
        cache.put(i + "_" + j + "_" + step, false);
    }
}