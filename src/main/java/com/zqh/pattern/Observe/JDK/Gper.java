package com.zqh.pattern.Observe.JDK;

import java.util.Observable;

/**
 * @Author：zhengqh
 * @date 2020/3/23 12:51
 **/
public class Gper extends Observable {
    private String name = "Gper生态圈";
    private static Gper gper =new Gper();
    private Gper(){}
    public static Gper getInstance(){
        return gper;
    }
    //发布问题
    public void publishQuestion(Question question){
        System.out.println(question.getName()+"提问了！！");
        setChanged();
        notifyObservers(question);
    }
}
