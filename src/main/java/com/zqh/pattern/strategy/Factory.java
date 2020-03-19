package com.zqh.pattern.strategy;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:19
 **/
  //上下文
public class Factory {
    private static Map<String,IDiscount> map = new HashMap();
    static {
        map.put("CASHBACK",new CashBack());
        map.put("COUPON",new Coupon());
        map.put("FIGHT",new Fight());
    }
    private static final IDiscount EMPTY = new Empty();//默认没有优惠
    private Factory(){} //单例 私有化
    private interface Key{
        String CASHBACK = "CASHBACK";
        String COUPON = "COUPON";
        String FIGHT = "FIGHT";
    }

    // 获取优惠策略
    public static IDiscount getStrategy(String key){
       /* if(!map.containsKey(key)){
            return EMPTY;
        }
        return map.get(key);*/
       IDiscount iDiscount = map.get(key);
       return iDiscount==null? EMPTY:iDiscount;
    }
}
