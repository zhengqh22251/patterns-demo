package com.zqh.pattern.ChainOfResponsibility;

/**
 * @Author：zhengqh
 * @date 2020/3/19 11:01
 **/
public class MemberService {
    public void login(Member member){
        Handler notNullHandler =new NotNullHandler();
        Handler loginHandler =new LoginHandler();
        Handler roleHandle =new RoleHandle();
        notNullHandler.next(loginHandler);
        loginHandler.next(roleHandle);

        notNullHandler.doHandle(member);
    }
}
