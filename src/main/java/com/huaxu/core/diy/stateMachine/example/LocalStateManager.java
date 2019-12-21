package com.huaxu.core.diy.stateMachine.example;

import com.huaxu.core.diy.stateMachine.core.StateManager;

/**
 * 本地状态管理器
 */
public class LocalStateManager extends StateManager {

    private volatile LocalStateEnum currentState = LocalStateEnum.Init;

    @Override
    public String managerKey() {
        return "local_state_manager";
    }

    @Override
    public int currentState(String uuid) {
        return currentState.getState();
    }

    @Override
    public boolean setState(String uuid, int newState, int expectState) {

        if (expectState != currentState.state) {
            return false;
        }

        synchronized (this) {
            if (expectState != currentState.state) {
                return false;
            }
            currentState = LocalStateEnum.fromState(newState);
        }
        return true;
    }

    public enum LocalStateEnum {

        Init(0, "初始化"),
        Processing(1, "处理中"),
        Success(2,"成功"),
        Failed(3,"失败"),
        ;

        int state;
        String remark;

        LocalStateEnum(int state, String remark) {
            this.state = state;
            this.remark = remark;
        }

        public static LocalStateEnum fromState(Integer state) {
            if (state == null) {
                return null;
            }
            for (LocalStateEnum stateEnum : LocalStateEnum.values()) {
                if (stateEnum.state == state) {
                    return stateEnum;
                }
            }
            return null;
        }

        public int getState() {
            return state;
        }

        public String getRemark() {
            return remark;
        }
    }
}