package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/17 14:42</p>
 * <p>author：huaxu</p>
 *
 * 二叉搜索树的后序遍历序列
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * links: https://www.nowcoder.com/questionTerminal/a861533d45854474ac791d90e447bafd
 */
public class Topic23 {

    public static void main(String[] args) {
        boolean b = new Topic23().VerifySquenceOfBST(new int[]{4, 6, 7, 5});
        System.out.println(b);
    }

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        return isBST(sequence, 0, sequence.length - 1);
    }

    private boolean isBST(int[] arr, int left, int right) {
        if (left >= right) return true;
        int i = left;
        for (; i < right; i ++) { // 注意这里的i，最后一层循环结束可能是right
            if (arr[i] > arr[right]) break;
        }
        for (int j = i; j < right; j ++) {
            if (arr[j] < arr[right]) return false;
        }
        return isBST(arr, left, i - 1) && isBST(arr, i, right - 1);
    }
}