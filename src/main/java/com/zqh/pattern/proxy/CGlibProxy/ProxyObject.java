package com.zqh.pattern.proxy.CGlibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:34
 **/
public class ProxyObject implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    private void after() {
        System.out.println("after");
    }
    private void before() {
        System.out.println("before");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }
}
