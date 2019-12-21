package com.huaxu.core.diy.killIfElse.factoryPoly;

import java.util.HashMap;
import java.util.Map;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/03/05 20:39
 */
public class ProgrammerFactory {

    private static final String MODULE_A = "aaa";
    private static final String MODULE_B = "bbb";
    private static final String MODULE_C = "bbb";

    private static ProgrammerFactory muduleFactory = new ProgrammerFactory();
    private static Map<String, Programmer> result = new HashMap<>();
    private ProgrammerFactory() {}

    static {
        result.put(MODULE_A, new ModuleA());
        result.put(MODULE_B, new ModuleB());
    }

    public Programmer get(String id) {
        return result.get(id);
    }

    public static ProgrammerFactory getInstace(){
        return muduleFactory;
    }
}