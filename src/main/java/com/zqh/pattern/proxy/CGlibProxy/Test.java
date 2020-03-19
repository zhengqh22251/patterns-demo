package com.zqh.pattern.proxy.CGlibProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 14:03
 **/
public class Test {
    public static void main(String[] args) {
          zhangsan zhangsan =  (zhangsan)new ProxyObject().getInstance(zhangsan.class);
          zhangsan.findLove();
    }
}
