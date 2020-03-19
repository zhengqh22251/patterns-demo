package com.zqh.pattern.Adapt.interfaceAdapt;


/**
 * @Author：zhengqh
 * @date 2020/3/19 12:18
 **/
public class Test {
    public static void main(String[] args) {
        InterfaceAdapter adapter = new InterfaceAdapter(new AC220V());
        System.out.println(adapter.output5());
        System.out.println(adapter.output10());
        System.out.println(adapter.output20());// 这种会违背 单一职责原则
    }
} 
