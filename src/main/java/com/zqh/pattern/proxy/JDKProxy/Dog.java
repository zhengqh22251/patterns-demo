package com.zqh.pattern.proxy.JDKProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:52
 **/
public class Dog implements Animal{
    @Override
    public void findLove() {
        System.out.println("狗：找狗娃子");
    }
}
