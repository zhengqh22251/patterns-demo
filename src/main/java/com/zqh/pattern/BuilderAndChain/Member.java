package com.zqh.pattern.BuilderAndChain;

/**
 * @Author：zhengqh
 * @date 2020/3/19 10:41
 **/
public class Member {
    private String name;
    private String password;
    private String role;

    public Member(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
