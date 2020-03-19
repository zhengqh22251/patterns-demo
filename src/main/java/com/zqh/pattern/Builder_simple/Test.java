package com.zqh.pattern.Builder_simple;

/**
 * @Author：zhengqh
 * @date 2020/3/19 11:44
 **/
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addHomeWork("作业");
        builder.addName("建造者");
        System.out.println(builder.builder());
    }
}
