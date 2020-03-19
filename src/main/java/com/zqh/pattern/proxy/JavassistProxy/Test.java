package com.zqh.pattern.proxy.JavassistProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 14:19
 **/
public class Test {
        public static void main(String[] args) throws IllegalAccessException, InstantiationException {
            Person proxy = (Person) JavassistDynamicProxy.createProxy(Person.class,new MyMethodEnhanceHandler());
            proxy.consult();
            proxy.print("the pig");
        }

        private static class MyMethodEnhanceHandler implements MethodEnhanceHandler {
            public void doThrowing(Exception e) {
                System.out.println("AOP invoked throw a exception");
            }
            public void doBefore() {
                System.out.println("AOP before method invoked");
            }
            public void doAfter() {
                System.out.println("AOP after method invoked");
            }
        }

}
