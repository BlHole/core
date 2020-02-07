package com.huaxu.core.leetcode.topic600;

import java.util.*;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/02/07 15:24</p>
 * <p>author：huaxu</p>
 */
public class Topic690 {

    private class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    class Solution {
        public int getImportance(List<Employee> employees, int id) {
            Map<Integer, Employee> map = new HashMap<>();
            for (Employee employee : employees) {
                map.put(employee.id, employee);
            }
            return dfs(map, id);
        }

        private int dfs(Map<Integer, Employee> map, int id) {
            Employee employee = map.get(id);
            int ans = employee.importance;
            for (Integer subordinate : employee.subordinates) {
                ans += dfs(map, subordinate);
            }
            return ans;
        }


        public int getImportance_2(List<Employee> employees, int id) {
            int ans = 0;
            for (Employee item : employees) {
                if (item.id == id) {
                    if (item.subordinates.size() == 0) {
                        return item.importance;
                    }
                    ans += item.importance;
                    for (Integer sId : item.subordinates) {
                        ans += getImportance_2(employees, sId);
                    }
                    return ans;
                }
            }
            return ans;
        }

        public int getImportance_3(List<Employee> employees, int id) {
            Map<Integer, Employee> map = new HashMap<>();
            for (Employee employee : employees) {
                map.put(employee.id, employee);
            }
            Stack<Employee> stack = new Stack<>();
            stack.add(map.get(id));
            int ant = 0;
            while (!stack.isEmpty()) {
                Employee pop = stack.pop();
                ant += pop.importance;
                for (Integer subordinate : pop.subordinates) {
                    stack.add(map.get(subordinate));
                }
            }
            return ant;
        }
    }
}