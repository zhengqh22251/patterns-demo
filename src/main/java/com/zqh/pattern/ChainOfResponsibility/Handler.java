package com.zqh.pattern.ChainOfResponsibility;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:45
 **/
public abstract class Handler {
    // 构建单向链
    protected Handler next;
    public void next(Handler next){
        this.next = next;
    }
    public abstract void doHandle(Member member);
}
