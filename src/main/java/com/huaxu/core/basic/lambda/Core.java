package com.huaxu.core.basic.lambda;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/07 21:09
 */
@FunctionalInterface
public interface Core {
    int accept(int x1, int y1);
    default int process(Core core, final int x1, final int y1){
        return core.accept(x1, y1);
    }
}

class AI {
    public static void main(String[] args) {
        AI.process((x1, y1) -> x1+y1, 1, 0);
    }
    static int process (Core core, final int x1, final int y1){
        return core.accept(x1, y1);
    }
}