package com.huaxu.core.leetcode.topic100;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Topic146</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/07/31 17:50</p>
 * <p>创建用户：huaxu</p>
 */
public class Topic146 {

    class LRUCache {

        private int cap;
        private Map<Integer, Integer> map; // 保持插入顺序
        public LRUCache(int capacity) {
            this.map = new LinkedHashMap<>(capacity);
            this.cap = capacity;
        }

        public int get(int key) {
            if (map.keySet().contains(key)) {
                int value = map.get(key);
                map.remove(key);
                // 保证每次查询后，都在末尾
                map.put(key, value);
                return value;
            }
            return -1;
        }


        public void put(int key, int value) {
            if (map.keySet().contains(key)) {
                map.remove(key);

            } else if (map.size() == cap) {
                Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
                iterator.next();
                iterator.remove();
            }
            map.put(key, value);
        }
    }
}