package com.zqh.pattern.proxy.staticProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:18
 **/
public class Son implements Person {
    @Override
    public void findLove() {
        System.out.println("儿子：找一个傻白甜");
    }
}
