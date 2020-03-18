package com.zqh.pattern.delegate;

/**
 * @Author：zhengqh
 * @date 2020/3/18 21:44
 **/
public class EmployeeB implements Employee{
    protected  String goodAt ="python";
    public void doing(String task) {
        System.out.println("我是员工B，我擅长"+goodAt+"现在开始做");
    }
}
