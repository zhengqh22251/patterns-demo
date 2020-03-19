package com.zqh.pattern.ChainOfResponsibility;

/**
 * @Author：zhengqh
 * @date 2020/3/19 11:00
 **/
public class Test {
    public static void main(String[] args) {
      Member member = new Member();
      member.setName("zqh");
      member.setPassword("666");
      MemberService memberService = new MemberService();
      memberService.login(member);
    }
}
