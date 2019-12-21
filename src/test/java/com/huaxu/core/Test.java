package com.huaxu.core;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/15 15:46</p>
 * <p>author：huaxu</p>
 */
public class Test {

    public static void main(String[] args) {
//        List<String> nameList = Arrays.asList("Darcy", "Chris", "Linda", "Sid", "Kim", "Jack", "Poul", "Peter");
//        // 1. 筛选出名字长度为4的
//        // 2. 名字前面拼接 This is
//        // 3. 遍历输出
//        nameList.stream()
//                .filter(name -> name.length() == 4)
//                .map(name -> "This is "+name)
//                .forEach(name -> System.out.println(name));
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }
}