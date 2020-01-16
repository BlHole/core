package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 14:25</p>
 * <p>author：huaxu</p>
 *
 * 二维数组中的查找
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 *  links: https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
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