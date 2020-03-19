package com.zqh.pattern.proxy.JDKProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:18
 **/
public class zhangsan implements Person {
    @Override
    public void findLove() {
        System.out.println("张三：找一个傻白甜");
    }

    @Override
    public void buy() {
        System.out.println("张三：买");
    }
}
