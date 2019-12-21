package com.huaxu.core.curr.forkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/17 17:43
 */
public class ForkJoinTaskExample extends RecursiveTask<Integer> {

    private int start;
    private int end;
    private int RUN_LIMIT;

    public ForkJoinTaskExample(int start, int end, int RUN_LIMIT) {
        this.start = start;
        this.end = end;
        this.RUN_LIMIT = RUN_LIMIT;
    }

    private int coreFunction(){
        int sum;
        if (end == start) {
            sum = start;
            System.out.println("执行边界运算 "+ start+"="+sum);
        } else {
            sum = start+end;
            System.out.println("执行运算 "+ start+"+"+end+"="+sum);
        }
        return sum;
    }

    private boolean isRunLimitElement() {
        return end-start < RUN_LIMIT;
    }

    /**
     *<p>方法说明: 核心方法：子任务拆分规则，重造结果</p>
     *<p>入参类型: []</p>
     *<p>出参类型: java.lang.Integer</p>
     *<p>创建时间: 4:07 PM 2019/4/18</p>
     *<p>方法作者: huaxu</p>
     *<p>异   常:</p>
     */
    @Override
    protected Integer compute() {

        if (isRunLimitElement())
            return coreFunction();

        int middle = (start+end) >> 1;
        ForkJoinTaskExample leftSubTask = new ForkJoinTaskExample(start, middle, RUN_LIMIT);
        ForkJoinTaskExample rightSubTask = new ForkJoinTaskExample(middle + 1, end, RUN_LIMIT);

        ForkJoinTask.invokeAll(leftSubTask, rightSubTask);

        Integer leftJoin = leftSubTask.join();
        Integer rightJoin = rightSubTask.join();
        return leftJoin+rightJoin;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> submit = forkJoinPool.submit(new ForkJoinTaskExample(1,99, 2));

        try {
            Integer integer = submit.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}