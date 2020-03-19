package com.zqh.pattern.proxy.JDKProxy;

import com.zqh.pattern.Adapt.interfaceAdapt.DCAdapt;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:41
 **/
public class Test {
    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject();
        //Person zhangsan = proxyObject.getInstance(new zhangsan());
        Person wangwu = (Person) proxyObject.getInstance(new wangwu());//王五 已经是代理后的对象了 重写了
        wangwu.findLove();
        wangwu.buy();

        Animal dog = (Animal) proxyObject.getInstance(new Dog());
        dog.findLove();

    }
}
