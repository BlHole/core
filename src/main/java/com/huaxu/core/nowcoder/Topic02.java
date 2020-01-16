package com.huaxu.core.nowcoder;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2020/01/16 14:31</p>
 * <p>author：huaxu</p>
 *
 * 替换空格
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 *
 * links： https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class Topic02 {

    public String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }
}