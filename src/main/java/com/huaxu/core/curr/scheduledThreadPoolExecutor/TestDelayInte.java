package com.huaxu.core.curr.scheduledThreadPoolExecutor;


import java.util.Date;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/11/21 15:22</p>
 * <p>author：huaxu</p>
 */
public class TestDelayInte implements Delayed {

    private String name;
    private long executeTime;

    public TestDelayInte(long executeTime, String name) {
        this.executeTime = executeTime;
        this.name = name;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(executeTime - System.currentTimeMillis(), unit.SECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        TestDelayInte task = (TestDelayInte) o;
        return executeTime > task.executeTime ? 1 : (executeTime < task.executeTime ? -1 : 0);
    }

    @Override
    public String toString() {
        return "TestDelayInte{" +
                "name='" + name + '\'' +
                ", executeTime=" + executeTime +
                '}';
    }

    public static void main(String[] args) {
        TestDelayInte testDelayInte = new TestDelayInte(System.currentTimeMillis() + 400000L, "huaxu delayed");
        System.out.println(testDelayInte);
    }
}