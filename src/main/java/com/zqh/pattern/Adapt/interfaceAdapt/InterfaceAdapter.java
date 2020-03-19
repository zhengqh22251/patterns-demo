package com.zqh.pattern.Adapt.interfaceAdapt;

import com.zqh.pattern.Adapt.ClassAdapt.DC5;

/**
 * @Author：zhengqh
 * @date 2020/3/19 12:13
 **/
public class InterfaceAdapter implements DCAdapt {

     private AC220V ac220V;

    public InterfaceAdapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }


    @Override
    public int output5() {
        return ac220V.outPut220()/44;
    }

    @Override
    public int output10() {
        return ac220V.outPut220()/22;
    }

    @Override
    public int output20() {
        return ac220V.outPut220()/11;
    }
}
