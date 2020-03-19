package com.zqh.pattern.Adapt.ClassAdapt;

/**
 * @Author：zhengqh
 * @date 2020/3/19 12:13
 **/
public class ClassAdapter extends AC220V implements DC5 {

    @Override
    public int output5() {
        int inuput = super.outPut220();
        int output = inuput/44;
        System.out.println("输入"+inuput+"---->输出："+output);
        return output;
    }
}
