package com.zqh.pattern.BuilderAndChain;

/**
 * @Author：zhengqh
 * @date 2020/3/19 11:01
 **/
public class MemberService {
    public void login(Member member) {
        Handler.Bulidr bulidr = new Handler.Bulidr();
        bulidr.addHandle(new NotNullHandler()).
                addHandle(new LoginHandler()).
                addHandle(new RoleHandle());
        bulidr.build().doHandle(member);
    }
}
