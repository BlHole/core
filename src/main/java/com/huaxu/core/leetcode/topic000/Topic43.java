package com.huaxu.core.leetcode.topic000;

import java.util.Stack;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic43</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/13 23:13</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic43 {

    public static void main(String[] args) {

        String a = new Topic43().new Solution().multiply("2", "3");
        System.out.println(a);
    }

    class Solution {
        public String multiply(String num1, String num2) {
            if("0".equals(num1) || "0".equals(num2)) return "0";

            int[][] result = new int[240][240];
            for (int length2 = num2.length()-1,i = length2; i >= 0; i--) {
                int index = length2 - i;
                for (int length1 = num1.length()-1, j = length1; j >= 0; j--) {
                    int mulutNum1 = Integer.parseInt(num1.charAt(j)+"");
                    int mulutNum2 = Integer.parseInt(num2.charAt(i)+"");
                    result[index][index+length1-j] += (mulutNum1*mulutNum2)%10;
                    result[index][index+length1-j+1] += (mulutNum1*mulutNum2)/10;
                }
            }

            Stack<Integer> stack = new Stack<>();
            int sum = 0;
            for (int i = 0, length = num1.length()+num2.length(); i < length; i++) {
                for (int j = 0; j < num2.length(); j++) {
                    sum += result[j][i];
                }
                stack.add(sum%10);
                sum/=10;
            }
            stack.add(sum);
            StringBuilder sv = new StringBuilder();
            while (!stack.isEmpty()) {
                Integer pop = stack.pop();
                if (sv.toString().length() == 0 && pop == 0) continue;
                sv.append(pop);
            }
            return String.valueOf(sv);
        }
    }
}