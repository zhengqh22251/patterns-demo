package com.zqh.pattern.strategy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:13
 **/
public class CashBack  implements IDiscount {
    @Override
    public void rebate() {
        System.out.println("返现优惠");
    }
}
