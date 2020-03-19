package com.zqh.pattern.strategy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:16
 **/
public class Active {
    private IDiscount iDiscount;

    public Active(IDiscount iDiscount) {
        this.iDiscount = iDiscount;
    }

    public void execute(){
        iDiscount.rebate();
    }
}
