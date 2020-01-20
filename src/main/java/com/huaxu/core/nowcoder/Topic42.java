package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/20 15:02</p>
 * <p>author：huaxu</p>
 *
 * 翻转单词顺序列
 *
 * 题目描述
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 *
 * links： https://www.nowcoder.com/questionTerminal/3194a4f4cf814f63919d0790578d51f3
 */
public class Topic42 {

    public static void main(String[] args) {
        String s = new Topic42().ReverseSentence(" ");
        System.out.println(s);
    }

    public String ReverseSentence(String str) {
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i --) {
            sb.append(" " + split[i]);
        }
        return "".equals(sb.toString()) ? str : sb.toString().substring(1);
    }
}