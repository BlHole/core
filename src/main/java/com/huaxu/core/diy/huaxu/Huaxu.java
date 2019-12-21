package com.huaxu.core.diy.huaxu;

import com.huaxu.core.diy.killIfElse.factoryPoly.Programmer;
import com.huaxu.core.diy.killIfElse.factoryPoly.ProgrammerFactory;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Huaxu</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/01 14:38</p>
 * <p>创建用户：huaxu</p>
 */
public class Huaxu {

    /**
     * 熟悉java语言，设计模式，集合，多线程，JVM
     * 熟悉spring，
     * 熟悉tomcat，nginx高可用
     * 熟悉redis，kafka
     * 了解常用的数据结构，算法
     */
    public static void showTechnologyTag(String name) {
        Programmer programmer = ProgrammerFactory.getInstace().get(name);
        programmer.showTechnology();
    }

    class PrimaryProgrammer implements com.huaxu.core.diy.killIfElse.factoryPoly.Programmer {
        @Override
        public void showTechnology() {
            good("Java","Collection","Multi-thread","JVM");
            adept("web frame","middleware","HA");
            know("data structure","algorithm");
        }

        private void good(String... content) {
        }
        private void adept(String... content) {
        }
        private void know(String... content) {
        }
    }

}