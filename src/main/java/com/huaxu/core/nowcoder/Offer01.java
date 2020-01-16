package com.huaxu.core.nowcoder;

import java.util.ArrayList;

/**
 * <p>project: core</p>
 * <p>description:
 *
 *      小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 *      但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 *      没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,
 *      你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 *      links: https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe?tpId=13&tqId=11194&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *      </p>
 * <p>create: 2020/01/16 11:30</p>
 * <p>author：huaxu</p>
 */
public class Offer01 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new Offer01().new Solution().FindContinuousSequence(3);
    }

    class Solution {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            int length = sum / 2 + 1;
            for (int i = 1; i <= length; i ++) {
                ArrayList<Integer> ans = new ArrayList<>();
                int sum_temp = 0;
                for (int j = i; j <= length; j ++) {
                    if (sum_temp == sum) {
                        res.add(ans);
                        break;

                    } else if (sum_temp > sum){
                        break;

                    } else {
                        ans.add(j);
                        sum_temp += j;
                    }
                }
            }
            return res;
        }
    }
}