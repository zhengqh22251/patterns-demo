package com.zqh.pattern.ChainOfResponsibility;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:51
 **/
public class LoginHandler extends Handler{

    @Override
    public void doHandle(Member member) {
        // 本应该数据库校验 ，这里直接设置成成功
        System.out.println("登录成功");
        member.setRole("admin");
        next.doHandle(member);
    }
}
