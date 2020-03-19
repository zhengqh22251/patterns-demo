package com.zqh.pattern.strategy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:12
 **/
public class Coupon implements IDiscount {
    @Override
    public void rebate() {
        System.out.println("优惠券");
    }
}
