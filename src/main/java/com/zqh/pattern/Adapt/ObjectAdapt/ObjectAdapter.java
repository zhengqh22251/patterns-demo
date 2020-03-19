package com.zqh.pattern.Adapt.ObjectAdapt;

import com.zqh.pattern.Adapt.ClassAdapt.DC5;

/**
 * @Author：zhengqh
 * @date 2020/3/19 12:13
 **/
public class ObjectAdapter implements DC5 {

     private AC220V ac220V;

    public ObjectAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int output5() {
        int inuput = ac220V.outPut220();
        int output = inuput/44;
        System.out.println("输入"+inuput+"---->输出："+output);
        return output;
    }
}
