package com.zqh.pattern.Observe.GUAVA;

import com.google.common.eventbus.EventBus;

/**
 * @Author：zhengqh
 * @date 2020/3/23 13:10
 **/
public class Test {
    public static void main(String[] args) {
        // 消息总线
        EventBus eventBus =new EventBus();
        GuavaEvent gua = new GuavaEvent();
        eventBus.register(gua);
        Pojo pojo= new Pojo("zqh");
        eventBus.post(pojo);
    }
}
