package com.zqh.pattern.proxy.JDKProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:18
 **/
public class wangwu implements Person {
    @Override
    public void findLove() {
        System.out.println("王五：是个女的就行");
    }

    @Override
    public void buy() {
        System.out.println("王五：不买");
    }
}
