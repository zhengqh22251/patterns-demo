package com.zqh.pattern.BuilderAndChain;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:45
 **/
public abstract class Handler<T> {
    // 构建单向链
    protected Handler next;
    public void next(Handler next){
        this.next = next;
    }
    public abstract void doHandle(Member member);
    // 建造者模式
    public static class Bulidr<T>{
        private Handler<T> head;
        private Handler<T> tail;
        public Bulidr<T> addHandle(Handler handler){
            if(this.head==null){ //第一次进来
                this.head =handler;
                this.tail =handler;
                return this;
            }
          this.tail.next(handler);// 从尾部追加
          this.tail = handler;  // tail指向最后一个节点
          return this;
        }

        // 返回头节点 从头节点开始处理
        public Handler<T> build(){
            return this.head;
        }
    }
}
