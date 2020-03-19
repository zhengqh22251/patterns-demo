package com.zqh.pattern.Adapt.ObjectAdapt;



/**
 * @Author：zhengqh
 * @date 2020/3/19 12:18
 **/
public class Test {
    public static void main(String[] args) {
        ObjectAdapter adapter = new ObjectAdapter(new AC220V());
        System.out.println(adapter.output5());
    }
}
