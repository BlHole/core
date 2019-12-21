package com.huaxu.core.designModel.acitonModel.command;

import com.huaxu.core.designModel.acitonModel.command.impl.ChangFen;
import com.huaxu.core.designModel.acitonModel.command.impl.HeFen;
import com.huaxu.core.designModel.acitonModel.command.impl.HunTun;
import com.huaxu.core.designModel.acitonModel.command.impl.Waiter;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: Main</p>
 * <p>文件描述: 命令模式</p>
 * <p>创建日期: 2019/06/11 21:11</p>
 * <p>创建用户：huaxu</p>
 */
public class Main {

    public static void main(String[] args) {
        Waiter fwy=new Waiter();
        fwy.setChangFen(new ChangFen());//设置肠粉菜单
        fwy.setHunTun(new HeFen());     //设置河粉菜单
        fwy.setHeFen(new HunTun());     //设置馄饨菜单
        fwy.chooseChangFen();  //选择肠粉
        fwy.chooseHeFen();     //选择河粉
        fwy.chooseHunTun();    //选择馄饨
    }
}