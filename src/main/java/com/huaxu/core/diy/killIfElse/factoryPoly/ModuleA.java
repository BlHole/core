package com.huaxu.core.diy.killIfElse.factoryPoly;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/05 20:38
 */
public class ModuleA implements Programmer {

    @Override
    public void showTechnology() {
        runThreadModuleA();
    }

    public void runThreadModuleA(){
        System.out.println("runThreadModuleA");
    }
}