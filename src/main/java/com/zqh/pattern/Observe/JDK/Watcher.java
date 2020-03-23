package com.zqh.pattern.Observe.JDK;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author：zhengqh
 * @date 2020/3/23 12:56
 **/
// 观察者 实现Observe
public class Watcher implements Observer {
    private String name;

    public Watcher(String name) {
        this.name = name;
    }

    // 被观察者  参数（这里就是问题）
    @Override
    public void update(Observable o, Object arg) {
     Gper gper = (Gper)o;
     Question question = (Question)arg;
     System.out.println("---------------------");
        System.out.println(name+"，你好\n"+
                "你收到了"+question.getName()+"同学在社区上的一个提问，如下：\n"+
                question.getContent());

    }
}
