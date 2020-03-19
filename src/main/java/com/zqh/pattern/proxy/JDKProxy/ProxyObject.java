package com.zqh.pattern.proxy.JDKProxy;

import javax.management.relation.InvalidRelationTypeException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 13:34
 **/
public class ProxyObject implements InvocationHandler{
    private Object target;
    public Object getInstance(Object target){
        this.target =target;
        Class<?> clazz = target.getClass();
        return  Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),
                this);//this指的是代理对象
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         before();
         Object result= method.invoke(this.target,args);
         after();
         return result;
    }
    private void after() {
        System.out.println("after");
    }
    private void before() {
        System.out.println("before");
    }
}
