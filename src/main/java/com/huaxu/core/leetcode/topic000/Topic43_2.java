package com.huaxu.core.leetcode.topic000;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic43_2</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/14 14:44</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic43_2 {

    public static void main(String[] args) {
        String multiply = new Topic43_2().new Solution().multiply("4", "9");
        System.out.println(multiply);
    }

    class Solution {
        public String multiply(String num1, String num2) {
            if("0".equals(num1) || "0".equals(num2)) return "0";

            int[][] result = new int[240][240];
            int l1 = num1.length()-1;
            int l2 = num2.length()-1;
            for (int i = l2; i >= 0; i--) {
                int index = l2 - i;
                for (int j = l1; j >= 0; j--) {
                    int num = Integer.parseInt(num1.charAt(j)+"") * Integer.parseInt(num2.charAt(i)+"");
                    result[index][index+l1-j] += num%10;
                    result[index][index+l1-j+1] += num/10;
                }
            }

            int sum = 0;
            StringBuilder sv = new StringBuilder();
            for (int i = 0, length = num1.length()+num2.length(); i <length; i++) {
                for (int j = 0; j < num2.length(); j++) {
                    sum += result[j][i];
                }
                if (i+1 == length && sum == 0) break;
                sv.append(sum%10);
                sum/=10;
            }
            return sv.reverse().toString();
        }
    }
}