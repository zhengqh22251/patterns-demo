package com.zqh.pattern.Observe.JDK;

/**
 * @Author：zhengqh
 * @date 2020/3/23 13:00
 **/
public class Test {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Watcher watcher1 = new Watcher("Tom");
        Watcher watcher2 = new Watcher("Mic");
        gper.addObserver(watcher1);
        gper.addObserver(watcher2);

        Question question =new Question();
        question.setName("郑求华");
        question.setContent("观察者模式使用场景？");

        gper.publishQuestion(question);
    }
}
