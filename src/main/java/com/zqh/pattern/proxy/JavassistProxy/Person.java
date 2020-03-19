package com.zqh.pattern.proxy.JavassistProxy;

/**
 * @Author：zhengqh
 * @date 2020/3/19 14:22
 **/
public class Person implements DoctorSkill, OfficerSkill {
    private String name;

    @Override
    public void consult() {
        System.out.println("会诊病人");
    }

    @Override
    public void print(String fileName) {
        System.out.println("打印文件:" + fileName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}