package com.zqh.pattern.ChainOfResponsibility;



/**
 * @Author：zhengqh
 * @date 2020/3/19 10:47
 **/
public class NotNullHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        if(member.getName()==null||member.getPassword()==null){
            System.out.println("用户名，密码不为空！");
            return;
        }
        System.out.println("用户，密码不为空-->loading......");

        next.doHandle(member);// 往下传递
    }
}
