package com.zqh.pattern.Observe.Myself.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author：zhengqh
 * @date 2020/3/23 14:02
 **/
// 被观察者抽象
public class EventListener {

    Map<String,Event> events = new HashMap<String,Event>();

    public void addLiatener(String eventType, Object target, Method callback){
         events.put(eventType,new Event(target,callback));
    }

    public void addLiatener(String eventType, Object target) {
        try {
            this.addLiatener(eventType,target,target.getClass().getMethod("on"+toUpper(eventType),Event.class));
        } catch (NoSuchMethodException e) {
           // e.printStackTrace();
            return;
        }
    }

    //首字母大写
    private String toUpper(String eventType) {
        char[] chars= eventType.toCharArray();
        chars[0]  -= 32;
        return String.valueOf(chars);
    }

    private void trigger(Event event){
         event.setSource(this);
         event.setTime(System.currentTimeMillis());
         if(event.getCallback() != null){
             //使用发射调用回调函数
             try {
                 event.getCallback().invoke(event.getTarget(),event);
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
    }
    protected  void trigger(String trigger){
       if(!this.events.containsKey(trigger)){
           return;
       }
       trigger(this.events.get(trigger).setTrigger(trigger));
    }

}
