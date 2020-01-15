package com.huaxu.core.leetcode.topic200;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/14 17:37</p>
 * <p>author：huaxu</p>
 */
public class Topic208 {


    class Trie {

        class TrieNode {

            private TrieNode[] childNode;

            private boolean isEnd;

            private int R = 26;

            public TrieNode() {
                isEnd = false;
                this.childNode = new TrieNode[R];
            }

            public boolean contains(char c) {
                return childNode[c - 'a'] != null;
            }

            public void put(char c, TrieNode trieNode) {
                childNode[c - 'a'] = trieNode;
            }

            public TrieNode get(char c) {
                return childNode[c - 'a'];
            }
        }

        private TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!node.contains(c)) {
                    node.put(c, new TrieNode());
                }
                node = node.get(c);
            }
            node.isEnd = true;
        }

        public TrieNode prevWith(String prev) {
            TrieNode node = root;
            for (int i = 0; i < prev.length(); i++) {
                char c = prev.charAt(i);
                if (node.get(c) != null) {
                    node = node.get(c);
                } else {
                    return null;
                }
            }
            return node;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode trieNode = prevWith(word);
            return trieNode != null && trieNode.isEnd;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode trieNode = prevWith(prefix);
            return trieNode != null;
        }
    }
}