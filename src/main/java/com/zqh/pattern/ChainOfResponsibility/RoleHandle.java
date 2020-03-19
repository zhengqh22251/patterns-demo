package com.zqh.pattern.ChainOfResponsibility;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:58
 **/
public class RoleHandle extends Handler {
    @Override
    public void doHandle(Member member) {
        if(!"admin".equals(member.getRole())){
            System.out.println("权限不足");
            return;
        }
        System.out.println("欢迎admin，随便玩！");
    }
}
