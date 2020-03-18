package com.zqh.pattern.template;

/**
 * @Author：zhengqh
 * @date 2020/3/18 22:38
 **/
public class Test {
    public static void main(String[] args) {
        JavaCourse javaCourse =new JavaCourse();
        javaCourse.setNeedCheck(true);
        javaCourse.createCourse();

        System.out.println("===================");

        PythonCourse pythonCourse =new PythonCourse();
        pythonCourse.setNeedCheck(false);
        pythonCourse.createCourse();
    }
}
