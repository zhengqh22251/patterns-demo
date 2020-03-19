package com.zqh.pattern.proxy.staticProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:20
 **/
public class Test {
    public static void main(String[] args) {
        Father person =new Father(new Son());
        person.findLove();
    }
}
