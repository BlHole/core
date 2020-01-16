package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 18:08</p>
 * <p>author：huaxu</p>
 */
public class Topic13_2 {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6};
        reOrderArray(ints);
        System.out.println(ints);
    }

    static public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
}