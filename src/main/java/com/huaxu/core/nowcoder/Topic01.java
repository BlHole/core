package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 14:25</p>
 * <p>author：huaxu</p>
 */
public class Topic01 {

    public boolean Find(int target, int [][] array) {
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[0].length; j++) {
                if (target == array[i][j]) return true;
            }
        }
        return false;
    }
}