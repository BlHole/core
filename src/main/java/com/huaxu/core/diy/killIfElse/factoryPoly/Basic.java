package com.huaxu.core.diy.killIfElse.factoryPoly;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/05 20:33
 */
public class Basic {

    public static final String MODULE_A = "aaa";
    public static final String MODULE_B = "bbb";

    public void run(String id) {

        if (MODULE_A.equals(id)) {
            runThreadModuleA();
        } else if (MODULE_B.equals(id)) {
            runThreadModuleB();
        }
    }

    private void runThreadModuleB() {
        System.out.println("runThreadModuleB");
    }


    private void runThreadModuleA() {
        System.out.println("runThreadModuleA");
    }

}