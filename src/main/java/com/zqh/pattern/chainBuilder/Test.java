package com.zqh.pattern.chainBuilder;

/**
 * @Author：zhengqh
 * @date 2020/3/19 11:44
 **/
public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addHomeWork("作业").addName("建造者").addVadio("视频");
        System.out.println(builder.builder());
    }
}
