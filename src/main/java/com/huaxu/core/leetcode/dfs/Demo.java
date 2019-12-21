package com.huaxu.core.leetcode.dfs;

/**
 * <p>项目名称: leetcode</p>
 * <p>文件名称: Demo</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/06/25 16:51</p>
 * <p>创建用户：huaxu</p>
 */
public class Demo {


    public static void main(String[] args) {
        new Demo().dfs(0, 3, new int[]{1,2,3}, new boolean[3]);
    }

    public void dfs(int step, int length, int[] a, boolean[] book) {
        if (step == length) {
            for (int i : a) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < length; i++) {
            if (!book[i]) {
                a[step] = i+1;
                book[i] = true;
                dfs(step+1, length, a, book);
                book[i] = false;
            }
        }
    }
}