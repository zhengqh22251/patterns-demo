package com.zqh.pattern.BuilderAndChain;

/**
 * @Author：zhengqh
 * @date 2020/3/19 11:00
 **/
public class Test {
    public static void main(String[] args) {
      MemberService memberService = new MemberService();
      memberService.login(new Member("zqh",null));
    }
}
