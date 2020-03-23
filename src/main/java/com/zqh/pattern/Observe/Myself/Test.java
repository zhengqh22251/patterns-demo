package com.zqh.pattern.Observe.Myself;

import com.zqh.pattern.Observe.Myself.handler.Mouse;
import com.zqh.pattern.Observe.Myself.handler.MouseEventCallback;
import com.zqh.pattern.Observe.Myself.handler.MouseEventType;

/**
 * @Author：zhengqh
 * @date 2020/3/23 14:47
 **/
public class Test {
    public static void main(String[] args) {
        // 观察者
        MouseEventCallback callback =new MouseEventCallback();
        //  被观察者
        Mouse mouse = new Mouse();
        mouse.addLiatener(MouseEventType.ON_CLICK,callback);
        mouse.click();
        mouse.addLiatener(MouseEventType.ON_MOVE,callback);
        mouse.move();
    }
}
