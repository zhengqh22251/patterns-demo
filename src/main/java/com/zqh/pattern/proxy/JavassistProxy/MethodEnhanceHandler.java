package com.zqh.pattern.proxy.JavassistProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 14:20
 **/
public interface MethodEnhanceHandler {/**
 * 抛出异常时调用
 */
void doThrowing(Exception e);

    /**
     * 目标方法执行前调用
     */
    void doBefore();

    /**
     * 目标方法执行后调用
     */
    void doAfter();

}
