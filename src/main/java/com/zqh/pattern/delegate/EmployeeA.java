package com.zqh.pattern.delegate;

/**
 * @Author：zhengqh
 * @date 2020/3/18 21:44
 **/
public class EmployeeA implements Employee{
    protected  String goodAt ="java";
    public void doing(String task) {
        System.out.println("我是员工A，我擅长"+goodAt+"现在开始做");
    }
}
