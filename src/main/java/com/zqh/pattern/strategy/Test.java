package com.zqh.pattern.strategy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:14
 **/
public class Test {
    public static void main(String[] args) {
      //String key = "CASHBACK";
      String key = "";
      IDiscount iDiscount=  Factory.getStrategy(key);
      iDiscount.rebate();
    }
}
