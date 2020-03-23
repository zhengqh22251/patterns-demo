package com.zqh.pattern.Observe.Myself.handler;

import com.zqh.pattern.Observe.Myself.core.Event;

/**
 * @Author：zhengqh
 * @date 2020/3/23 14:02
 **/
// 观察者
public class  MouseEventCallback {
    public void onClick(Event e){
        System.out.println("鼠标单击----》回调");
        System.out.println(e.toString());
    }

    public void onMove(Event e){
        System.out.println("鼠标移动----》回调");
        System.out.println(e.toString());
    }
}
