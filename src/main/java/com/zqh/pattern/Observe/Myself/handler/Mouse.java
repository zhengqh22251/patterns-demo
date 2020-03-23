package com.zqh.pattern.Observe.Myself.handler;

import com.zqh.pattern.Observe.Myself.core.EventListener;

/**
 * @Author：zhengqh
 * @date 2020/3/23 14:03
 **/
// 具体的被观察者
public class Mouse extends EventListener {
   public void click(){
      System.out.println("鼠标单击");
      this.trigger(MouseEventType.ON_CLICK);
   }

   public void move(){
      System.out.println("鼠标移动");
      this.trigger(MouseEventType.ON_MOVE);
   }
}
