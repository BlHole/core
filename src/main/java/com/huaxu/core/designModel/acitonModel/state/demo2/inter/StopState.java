package com.huaxu.core.designModel.acitonModel.state.demo2.inter;

import com.huaxu.core.designModel.acitonModel.state.demo2.impl.Context;
import com.huaxu.core.designModel.acitonModel.state.demo2.impl.State;

public class StopState implements State {

   @Override
   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Stop State";
   }
}