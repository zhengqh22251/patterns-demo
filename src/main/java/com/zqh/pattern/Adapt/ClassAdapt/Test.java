package com.zqh.pattern.Adapt.ClassAdapt;

/**
 * @Author：zhengqh
 * @date 2020/3/19 12:18
 **/
public class Test {
    public static void main(String[] args) {
        ClassAdapter adapter = new ClassAdapter();
        System.out.println(adapter.output5());
        System.out.println(adapter.outPut220()); //违反最少知道原则

        DC5 adapter1 = new ClassAdapter();
        adapter1.output5();
    }
}
