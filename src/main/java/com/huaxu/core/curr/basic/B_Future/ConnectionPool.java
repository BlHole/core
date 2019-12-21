package com.huaxu.core.curr.basic.B_Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ConnectionPool {

    private ConcurrentHashMap<String, FutureTask<Connection>> pool = new ConcurrentHashMap<String, FutureTask<Connection>>();

    public Connection getConnection(String key) throws InterruptedException, ExecutionException {
        FutureTask<Connection> connectionTask = pool.get(key);
        if (connectionTask != null) {
            return connectionTask.get();
        } else {
            Callable<Connection> callable = new Callable<Connection>() {
                @Override
                public Connection call() throws Exception {
                    return createConnection();
                }
            };
            FutureTask<Connection> newTask = new FutureTask<>(callable);
            connectionTask = pool.putIfAbsent(key, newTask);
            if (connectionTask == null) {
                connectionTask = newTask;
                connectionTask.run();
            }
            return connectionTask.get();
        }
    }

    public Connection createConnection() {
        return new Connection();
    }

    class Connection {}
}