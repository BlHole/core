package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/06 17:33</p>
 * <p>author：huaxu</p>
 *
 * 机器人的运动范围
 *
 * 题目描述
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 *
 * links: https://www.nowcoder.com/questionTerminal/6e5207314b5241fb83f2329e89fdecc8
 */
public class Topic63 {

    public static void main(String[] args) {
        int count = new Topic63().movingCount(5, 10, 10);
        System.out.println(21 == count);
    }

    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] map = new boolean[rows][cols];
        return solution(map, threshold, rows, cols, 0, 0);
    }

    private int solution(boolean[][] map, int threshold, int rows, int cols, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || map[i][j]) {
            return 0;
        }
        map[i][j] = true;
        if (!checkSum(threshold, i, j)) {
            return 0;
        }
        return 1 + solution(map, threshold, rows, cols, i - 1, j)
                + solution(map, threshold, rows, cols, i + 1, j)
                + solution(map, threshold, rows, cols, i, j - 1)
                + solution(map, threshold, rows, cols, i, j + 1);
    }

    private boolean checkSum(int threshold, int row, int col) {
        int sum = 0;
        while (row != 0) {
            sum += row % 10;
            row = row / 10;
        }
        while (col != 0) {
            sum += col % 10;
            col = col / 10;
        }
        return sum <= threshold;
    }
}