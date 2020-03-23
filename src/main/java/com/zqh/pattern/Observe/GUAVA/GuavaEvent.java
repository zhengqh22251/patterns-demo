package com.zqh.pattern.Observe.GUAVA;

import com.google.common.eventbus.Subscribe;

/**
 * @Author：zhengqh
 * @date 2020/3/23 13:08
 **/
   // 观察者回调
public class GuavaEvent {
    @Subscribe
    public void observer(Object str){
        if(str instanceof Pojo){
            System.out.println("执行了observer方法,参数"+str.toString());

        }
    }
}
