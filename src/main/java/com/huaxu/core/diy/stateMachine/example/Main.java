package com.huaxu.core.diy.stateMachine.example;

import com.huaxu.core.diy.stateMachine.core.StateAutoSync;
import com.huaxu.core.diy.stateMachine.core.StateListener;
import com.huaxu.core.diy.stateMachine.core.StateManager;
import com.huaxu.core.diy.stateMachine.core.StateTransition;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/12/21 10:40</p>
 * <p>author：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        StateManager localStateManager = new LocalStateManager();
        final String localManagerKey = localStateManager.managerKey();

        /**
         * 注册状态变化监听器
         */
        localStateManager.registerListener(new StateListener() {
            @Override
            public void stateChanged(String uuid, int preState, int postState) {
                // do something
            }
        });

        String uuid = "123";
        //
        localStateManager.doTransition(uuid, new StateTransition() {
            @Override
            public List<Integer> preState() {
                List<Integer> list = new ArrayList<>();
                list.add(LocalStateManager.LocalStateEnum.Init.state);
                return list;
            }

            @Override
            public int operation(String uuid) {
                // do something than change state
                return LocalStateManager.LocalStateEnum.Processing.state;
            }
        });

        StateAutoSync stateAutoSync = new StateAutoSync();
        stateAutoSync.register(localStateManager);

        // 注册自动状态转移操作
        localStateManager.registerAutoTransition(new StateTransition() {
            @Override
            public List<Integer> preState() {
                List<Integer> list = new ArrayList<>();
                list.add(LocalStateManager.LocalStateEnum.Processing.state);
                return list;
            }

            @Override
            public int operation(String uuid) {
                // do something than change state
                return LocalStateManager.LocalStateEnum.Success.getState();
            }
        });

        // 遍历所有的处理中的uuid，调用 stateAutoSync 自动同步状态
        stateAutoSync.syncState(uuid, localManagerKey);
    }
}