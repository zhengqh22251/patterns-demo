package com.zqh.pattern.strategy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:09
 **/
public class Fight  implements IDiscount {
    //拼团偶优惠
    @Override
    public void rebate() {
        System.out.println("拼团优惠");
    }
}
