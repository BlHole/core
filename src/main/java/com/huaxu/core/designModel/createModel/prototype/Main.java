package com.huaxu.core.designModel.createModel.prototype;

import com.huaxu.core.designModel.createModel.prototype.shallow.Citation;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 原型模式</p>
 * <p>创建日期: 2019/06/07 22:56</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("张三","同学：在2016学年第一学期中表现优秀，被评为三好学生。","东丽学院");
        citation.display();

        Citation citationClone = (Citation)citation.clone();
        citationClone.setName("李四");
        citationClone.display();
    }
}