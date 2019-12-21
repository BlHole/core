package com.huaxu.core.diy.killIfElse.factoryPoly;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/05 20:38
 */
public class ModuleB implements Programmer {


    @Override
    public void showTechnology() {
        runThreadModuleB();
    }

    private void runThreadModuleB() {
        System.out.println("runThreadModuleB");
    }
}