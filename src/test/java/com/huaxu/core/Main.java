package com.huaxu.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LRUCache<Integer, Integer> cache = new LRUCache(num);
        sc.nextLine();
        while (sc.hasNext()) {
            String[] cmds = sc.nextLine().trim().split(" ");
            if (num > 0 && "p".equals(cmds[0])) {
                cache.put(Integer.parseInt(cmds[1]), Integer.parseInt(cmds[2]));
            } else if ("g".equals(cmds[0])) {
                if (num <= 0) {
                    System.out.println(-1);
                } else {
                    Object o = cache.get(Integer.parseInt(cmds[1]));
                    System.out.println(o == null ? -1 : o);
                }
            }
        }
    }
}

class LRUCache<K, V> {

    private int count, capacity;
    private Map<K, Node> map;
    private Node head, tail;

    private class Node {
        K key;
        V value;
        Node prev, next;

        Node() {}

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        this.head.next = this.tail;
        this.tail.prev = this.head;
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        Node node = map.get(key);
        if (node == null) {
            if (count == capacity) {
                map.remove(popTail().key);
                count--;
            }
            count++;
            node = new Node(key, value);
            map.put(key, node);
            addNodeHead(node);

        } else {
            node.value = value;
        }
    }

    private Node popTail() {
        Node node = tail.prev;
        removeNode(node);
        return node;
    }

    private void removeNode(Node node) {
        Node prevNode = node.prev;
        prevNode.next = node.next;
        node.next.prev = prevNode;
    }

    public V get(K key) {
        Node node = map.get(key);
        if (node == null) {
            return null;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addNodeHead(node);
    }

    private void addNodeHead(Node node) {
        Node oldHead = head.next;
        oldHead.prev = node;
        node.next = oldHead;
        node.prev = head;
        head.next = node;
    }
}