package com.zqh.pattern.proxy.JavassistProxy;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;
import javassist.util.proxy.ProxyObject;

import java.lang.reflect.Method;

/**
 * @Author：zhengqh
 * @date 2020/3/19 14:18
 **/
public class JavassistDynamicProxy {
    public static Object createProxy(Class<?> target, MethodEnhanceHandler methodEnhanceHandler)
            throws IllegalAccessException, InstantiationException {
        ProxyFactory factory = new ProxyFactory();
        factory.setSuperclass(target);// 继承 person？
        Class proxyClass = factory.createClass();// person子类？
        Object proxy = proxyClass.newInstance();// person子类实例？
        //设置拦截器
        ProxyObject proxyObject = (ProxyObject) proxy;
        proxyObject.setHandler(new InternalMethodHandler(methodEnhanceHandler));
        return proxy;
    }

    private static class InternalMethodHandler implements MethodHandler {
        private MethodEnhanceHandler methodEnhanceHandler;

        public InternalMethodHandler(MethodEnhanceHandler methodEnhanceHandler) {
            this.methodEnhanceHandler = methodEnhanceHandler;
        }

        public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
            Object retVal = null;
            try {
                if (methodEnhanceHandler != null) {
                    methodEnhanceHandler.doBefore();
                }

                retVal = proceed.invoke(self, args);//处理person里面的方法

            } catch (Exception e) {
                if (methodEnhanceHandler != null) {
                    methodEnhanceHandler.doThrowing(e);
                }
            } finally {
                if (methodEnhanceHandler != null) {
                    methodEnhanceHandler.doAfter();
                }
            }
            return retVal;
        }
    }
}
