package com.huaxu.core.designModel.acitonModel.state.demo2.impl;

public class Context {

   private State state;
 
   public Context(){
      state = null;
   }
 
   public void setState(State state){
      this.state = state;     
   }
 
   public State getState(){
      return state;
   }
}