package com.zqh.pattern.Observe.GUAVA;

/**
 * @Author：zhengqh
 * @date 2020/3/23 13:13
 **/
public class Pojo {

    String name;

    public Pojo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "【name:"+name+"】";
    }
}
