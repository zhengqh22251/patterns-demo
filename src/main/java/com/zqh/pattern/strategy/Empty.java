package com.zqh.pattern.strategy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:14
 **/
public class Empty implements IDiscount {
    @Override
    public void rebate() {
        System.out.println("无优惠");
    }
}
