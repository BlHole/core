package com.huaxu.core.designModel.acitonModel.observer.diy.inter;

import java.util.EventObject;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: RingEvent</p>
 * <p>文件描述: 具体事件抽象</p>
 * <p>创建日期: 2019/06/12 13:17</p>
 * <p>创建用户：huaxu</p>
 */
public class RingEvent extends EventObject {

    private static final long serialVersionUID=1L;
    private boolean sound;    //true表示上课铃声,false表示下课铃声

    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean getSound() {
        return this.sound;
    }
}
