package com.huaxu.core.designModel.acitonModel.observer.diy.impl;

import com.huaxu.core.designModel.acitonModel.observer.diy.inter.BellEventListener;
import com.huaxu.core.designModel.acitonModel.observer.diy.inter.RingEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BellEventSource {
    private List<BellEventListener> listener; //监听器容器
    public BellEventSource() {
        listener = new ArrayList<BellEventListener>();
    }

    //给事件源绑定监听器 
    public void addPersonListener(BellEventListener ren) {
        listener.add(ren); 
    }

    //事件触发器：敲钟，当铃声sound的值发生变化时，触发事件。
    public void ring(boolean sound) {
        String type = sound ? "上课铃":"下课铃";
        System.out.println(type+"响！");
        notifies(new RingEvent(this, sound));
    }

    protected void notifies(RingEvent e) {
        BellEventListener ren = null;
        Iterator<BellEventListener> iterator = listener.iterator();
        while(iterator.hasNext()) {
            ren = iterator.next();
            ren.heardBell(e); 
        } 
    }
}